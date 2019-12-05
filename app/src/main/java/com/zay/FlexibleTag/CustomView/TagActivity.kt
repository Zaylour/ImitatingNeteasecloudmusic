package com.zay.FlexibleTag.CustomView

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import androidx.appcompat.app.AppCompatActivity
import com.zay.FlexibleTag.R
import kotlinx.android.synthetic.main.label_avtivity.*
class TagActivity :AppCompatActivity() {
    private val lableSelected = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.label_avtivity)
        lableSelected.add("微信")
        lableSelected.add("TIM")
        lableSelected.add("百度网盘")
        lableSelected.add("多问")
        lableSelected.add("网易云音乐")
        lableSelected.add("优酷视频")
        lableSelected.add("微信")
        lableSelected.add("TIM")
        lableSelected.add("百度网盘")
        lableSelected.add("多问")
        lableSelected.add("网易云音乐")
        lableSelected.add("优酷视频")
        lableSelected.add("微信")
        lableSelected.add("TIM")
        lableSelected.add("百度网盘")
        lableSelected.add("多问")
        lableSelected.add("网易云音乐")
        lableSelected.add("优酷视频")
        lableSelected.add("微信")
        lableSelected.add("TIM")
        lableSelected.add("百度网盘")
        lableSelected.add("多问")
        lableSelected.add("网易云音乐")
        lableSelected.add("优酷视频")
        lableSelected.add("微信")
        lableSelected.add("TIM")
        lableSelected.add("百度网盘")
        lableSelected.add("多问")
        lableSelected.add("网易云音乐")
        lableSelected.add("优酷视频")
        Tag.setTags(myTag,lableSelected,R.layout.item_lable)
        btn_delete.setOnClickListener {
            shakeAllView(myTag)
        }
    }
    //抖动
    fun shakeAllView(tagView: Tag){
        //抖动动画
        val loadAnimation =
            AnimationUtils.loadAnimation(tagView.context, R.anim.shake_rotate)
        for (i in 0 until tagView.childCount ){
            val view = tagView.getChildAt(i)
            //设置为true动画结束后保持最后的状态
            loadAnimation.fillAfter = true
            view!!.startAnimation(loadAnimation)
        }
    }
    //取消抖动
    fun clearAllviewShake(tagView: Tag){
        for (i in 0 until tagView.childCount ){
            val view = tagView.getChildAt(i)
            view!!.clearAnimation()
        }
    }

}