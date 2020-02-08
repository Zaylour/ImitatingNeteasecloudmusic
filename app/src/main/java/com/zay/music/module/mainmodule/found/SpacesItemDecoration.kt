package com.zay.music.module.mainmodule.found

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
        outRect.left = 40
        if(parent.getChildLayoutPosition(view)==0){
            outRect.left = 60
        }else if(parent.getChildLayoutPosition(view)==5){
            outRect.right=60
        }
    }

}