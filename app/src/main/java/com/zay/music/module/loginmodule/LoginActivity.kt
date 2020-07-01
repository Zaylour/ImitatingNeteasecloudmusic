package com.zay.music.module.loginmodule

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.blankj.utilcode.util.RegexUtils
import com.blankj.utilcode.util.ToastUtils
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import com.tencent.mmkv.MMKV
import com.zay.music.module.mainmodule.MainActivity
import com.zay.music.R
import com.zay.music.data.RetrofitManager
import com.zay.music.databinding.ActivityLoginBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var kv = MMKV.defaultMMKV()
    var resLogin: Disposable?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         DataBindingUtil.setContentView<ActivityLoginBinding>(
            this@LoginActivity,
            R.layout.activity_login
        )
        QMUIStatusBarHelper.translucent(this)
        toLogin.setOnClickListener {
            if(TextUtils.isEmpty(phone.text.toString())){
                ToastUtils.showShort("请输入电话号码")
                return@setOnClickListener
            }else{
                if(!RegexUtils.isMobileSimple(phone.text.toString())){
                    ToastUtils.showShort("请输入正确的电话号码")
                    return@setOnClickListener
                }
            }
            if(TextUtils.isEmpty(password.text.toString())){
                ToastUtils.showShort("请输入密码")
            }

            login()
        }
    }
    fun login(){
        resLogin= RetrofitManager.instance.api.loginCellphone(phone.text.toString(),password.text.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Consumer<LoginBean> {
                override fun accept(data: LoginBean?) {
                    if(data!!.code==200){
                        kv.encode("userId",data.account.id.toString())
                        kv.encode("token",data.token)
                        kv.encode("nickname",data.profile.nickname)
                        kv.encode("avatarUrl",data.profile.avatarUrl)
                        kv.encode("backgroundUrl",data.profile.backgroundUrl)
                        data.save()
                        val intent= Intent(this@LoginActivity,MainActivity::class.java)
                        startActivity(intent)
                        kv.encode("islogin",true)
                        finish()
                    }else{
                        kv.encode("islogin",false)
                        ToastUtils.showShort("服务器繁忙,请稍后再试");
                    }
                }
            }, object : Consumer<Throwable> {
                override fun accept(throwable: Throwable?) {
                    kv.encode("islogin",false)
                    if (throwable is Exception) {
                        Log.e("xception", "网络错误!" + throwable.message);
                        ToastUtils.showShort("服务器繁忙,请稍后再试");
                    }
                }
            })
    }
}