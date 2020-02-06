package com.zay.music.CustomView

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.zay.music.R
class Tag : ViewGroup {
    private val TAG = "MyTag"
    //标签数据
    var tags = mutableListOf<String>()
    //被选过的标签
    var beSelectedTags = mutableListOf<String>()
    //标签左右间距
    var LEFT_RIGHT_SPACE: Int = 20
    //标签行间距
    var ROW_SPACE: Int = 20
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.Tag)
        LEFT_RIGHT_SPACE = typedArray.getDimensionPixelSize(R.styleable.Tag_leftAndRightSpace, 20)
        ROW_SPACE = typedArray.getDimensionPixelSize(R.styleable.Tag_rowSpace, 20)
    }
    //测量宽高
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        measureChildren(widthMeasureSpec, heightMeasureSpec)
        //获取高度的模式
        val hightMode = View.MeasureSpec.getMode(heightMeasureSpec)
        //获取建议的高度
        val heigetSize = View.MeasureSpec.getSize(heightMeasureSpec)
        //布局的宽度采用建议宽度（match_parent或者size），如果设置wrap_content也是match_parent的效果
        val width = View.MeasureSpec.getSize(widthMeasureSpec)
        val height: Int
        if (hightMode == View.MeasureSpec.EXACTLY) {
            //EXACTLY 用户自己指定了尺寸大小，我们就不用再去干涉了，当然是以指定的大小为主啦。
            height = heigetSize
        } else { //其他情况下（AT_MOST、UNSPECIFIED）需要计算高度
            //获取子view数量
            val childCount = childCount
            if (childCount == 0) {
                height = 0
            } else {
                var row = 1//行数
                var widthSpace = width// 刚开始其实就是设置的宽度，或者是match_parent
                for (i in 0 until childCount) {
                    val view = getChildAt(i)
                    val childWidth = view.measuredWidth
                    //如果设置的宽度大于标签的宽度--就在同一行
                    if (widthSpace >= childWidth) {
                        widthSpace -= childWidth//减去一个标签的宽度，就是剩下的宽度了
                    } else {
                        //超过剩下的宽度时，就增加行数
                        row++
                        widthSpace = width - childWidth//宽度恢复开始的宽度减去一个标签的宽度
                    }
                    //减去标签左右间距
                    widthSpace -= LEFT_RIGHT_SPACE
                }
                //标签的高度相等--取一个就行了
                val childH = getChildAt(0).measuredHeight
                //总高度--标签高度*行数+行距*(行数-1)
                height = childH * row + ROW_SPACE * (row - 1)
            }
        }
        //测量完
        setMeasuredDimension(width, height)
    }
    //子view位置摆放
    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {
        var row = 0
        var right = 0   // 标签相对于布局的右侧位置
        var botom: Int       // 标签相对于布局的底部位置
        for (i in 0 until childCount) {
            val childView = getChildAt(i)
            val childW = childView.measuredWidth
            val childH = childView.measuredHeight
            //右侧位置=本行已经占有的位置+当前标签的宽度
            right += childW
            //底部位置=已经摆放的行数*（标签高度+行距）+当前标签高度
            botom = row * (childH + ROW_SPACE) + childH
            // 如果右侧位置已经超出布局右边缘，跳到下一行
            if (right > p3 - LEFT_RIGHT_SPACE) {
                row++
                right = childW
                botom = row * (childH + ROW_SPACE) + childH
            }
            Log.e(
                TAG, "left = " + (right - childW) + " top = " + (botom - childH) +
                        " right = " + right + " botom = " + botom
            )
            childView.layout(right - childW, botom - childH, right, botom)
            right += LEFT_RIGHT_SPACE
        }
    }
    companion object {
        //设置数据和标签的点击事件
        fun setTags(tag: Tag, lables: MutableList<String>,view:Int) {
            tag.removeAllViews()
            tag.tags.clear()
            tag.tags.addAll(lables)
            if ( tag.tags.size > 0) {
                val inflater = LayoutInflater.from(tag.context)
                for (lable in tag.tags) {
                    //获取标签布局
                    val tv = inflater.inflate(view, null) as TextView
                    tv.setText(lable)
                    //设置选中效果--这里是用来设置之前已经选过的标签
                    if (tag.beSelectedTags.contains(lable)) {
                        //选中
                        tv.isSelected = true
                        //可以设置颜色等
                    } else {
                        //未选中
                        tv.isSelected = false
                        //可以设置颜色等
                    }
                    //点击标签后，重置选中效果
                    tv.setOnClickListener {
                        tv.isSelected = if (tv.isSelected) false else true
                        if (tv.isSelected) {
                            //将选中的标签加入到lableSelected中
                            tag.beSelectedTags.add(lable)
                        } else {
                            tag.beSelectedTags.remove(lable)
                        }
                    }
                    //将标签添加到容器中
                    tag.addView(tv)
                }
            }
        }

    }
}