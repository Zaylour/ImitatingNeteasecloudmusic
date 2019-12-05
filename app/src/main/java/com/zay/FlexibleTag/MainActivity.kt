package com.zay.FlexibleTag
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zay.FlexibleTag.CustomView.TagActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_tag.setOnClickListener {
            startActivity(Intent(this@MainActivity, TagActivity::class.java))
        }
    }
}
