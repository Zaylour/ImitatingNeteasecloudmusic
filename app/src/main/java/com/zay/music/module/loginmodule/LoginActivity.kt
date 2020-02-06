package com.zay.music.module.loginmodule

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import com.tencent.mmkv.MMKV
import com.zay.music.module.mainmodule.MainActivity
import com.zay.music.R
import com.zay.music.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var kv = MMKV.defaultMMKV()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentView = DataBindingUtil.setContentView<ActivityLoginBinding>(
            this@LoginActivity,
            R.layout.activity_login
        )
        QMUIStatusBarHelper.translucent(this)

        toLogin.setOnClickListener {
            val intent= Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
            kv.encode("islogin",true)
            finish()
        }
    }

}