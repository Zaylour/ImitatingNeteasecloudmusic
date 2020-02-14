package com.zay.music.module.mainmodule.my

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpacesItemDecoration: RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = 20
        if(parent.getChildLayoutPosition(view)==0){
            outRect.left = 30
        }else if (parent.getChildLayoutPosition(view) == parent.adapter!!.itemCount-1) {
            outRect.right=30
        }
    }

}