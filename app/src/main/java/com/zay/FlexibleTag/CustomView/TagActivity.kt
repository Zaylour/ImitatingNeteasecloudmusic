package com.zay.FlexibleTag.CustomView

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
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
    //整体移动--用属性动画
    fun viewMove(view : View){
        val moveAnin=ValueAnimator.ofInt(0,3)
        // ofInt（）作用有两个
        // 1. 创建动画实例
        // 2. 将传入的多个Int参数进行平滑过渡:此处传入0和1,表示将值从0平滑过渡到1
        // 如果传入了3个Int参数 a,b,c ,则是先从a平滑过渡到b,再从b平滑过渡到C，以此类推
        // ValueAnimator.ofInt()内置了整型估值器,直接采用默认的.不需要设置，即默认设置了如何从初始值 过渡到 结束值
        // 步骤2：设置动画的播放各种属性
        moveAnin.setDuration(500);
        // 设置动画运行的时长
        moveAnin.setStartDelay(500);
        // 设置动画延迟播放时间
        moveAnin.setRepeatCount(0);
        // 设置动画重复播放次数 = 重放次数+1
        // 动画播放次数 = infinite时,动画无限重复
        moveAnin.setRepeatMode(ValueAnimator.RESTART);
        // 设置重复播放动画模式
        // ValueAnimator.RESTART(默认):正序重放
        // ValueAnimator.REVERSE:倒序回放
        // 步骤3：将改变的值手动赋值给对象的属性值：通过动画的更新监听器
        // 设置 值的更新监听器
        // 即：值每次改变、变化一次,该方法就会被调用一次
        moveAnin.addUpdateListener(object :ValueAnimator.AnimatorUpdateListener {
            override fun onAnimationUpdate(animation: ValueAnimator?) {
                var currentValue:Int = animation!!.getAnimatedValue() as Int;
                // 获得改变后的值
                System.out.println(currentValue);
                // 输出改变后的值
                // 步骤4：将改变后的值赋给对象的属性值，下面会详细说明
                //view.height=currentValue
                // 步骤5：刷新视图，即重新绘制，从而实现动画效果
                view.requestLayout();
            }
        });
        moveAnin.start();
        // 启动动画
    }
}