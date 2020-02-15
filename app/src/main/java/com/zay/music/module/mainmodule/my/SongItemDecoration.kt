package com.zay.music.module.mainmodule.my

import android.graphics.Rect
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SongItemDecoration: RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {



        outRect.bottom = 40

//        if (parent.getChildLayoutPosition(view) == parent.adapter!!.itemCount-1) {
//
//        }
    }
}