package com.zay.music
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.tencent.mmkv.MMKV
import com.zay.music.module.loginmodule.LoginActivity
import com.zay.music.module.mainmodule.MainActivity


//启动页
class SpalshActivity: AppCompatActivity() {
    var kv = MMKV.defaultMMKV()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //判断是否有登录
         isLogin()
    }

    //判断是否有登录
    fun isLogin(){
        val isLogin = kv.decodeBool("islogin",false)
        if(isLogin){
            val intent= Intent(this@SpalshActivity, MainActivity::class.java)
            startActivity(intent)
            kv.encode("islogin",true)
            finish()
        }else{
            val intent=Intent(this@SpalshActivity,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}