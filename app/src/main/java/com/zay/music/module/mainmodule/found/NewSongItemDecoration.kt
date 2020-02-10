package com.zay.music.module.mainmodule.found

import android.graphics.Rect
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class NewSongItemDecoration : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        Log.e("count", parent.adapter!!.itemCount.toString())
//        if(parent.adapter!!.itemCount%3==0){
//
//        }
        if (parent.getChildLayoutPosition(view) == parent.adapter!!.itemCount-1) {
            outRect.right = 100
        }
    }
}