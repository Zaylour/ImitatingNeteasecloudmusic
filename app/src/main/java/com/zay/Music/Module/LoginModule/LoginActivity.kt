package com.zay.Music.Module.LoginModule

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import com.tencent.mmkv.MMKV
import com.zay.Music.Module.MainModule.MainActivity
import com.zay.Music.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var kv = MMKV.defaultMMKV()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        QMUIStatusBarHelper.translucent(this)

        toLogin.setOnClickListener {
            val intent= Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
            kv.encode("islogin",true)
            finish()
        }
    }

}