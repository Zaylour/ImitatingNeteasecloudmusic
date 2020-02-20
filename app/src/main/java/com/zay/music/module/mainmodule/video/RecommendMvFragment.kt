package com.zay.music.module.mainmodule.video

import android.view.View
import com.qmuiteam.qmui.arch.QMUIFragment

import android.view.LayoutInflater
import android.widget.FrameLayout
import com.zay.music.R


class RecommendMvFragment: QMUIFragment() {

    override fun onCreateView(): View {

        val layout = LayoutInflater.from(activity).inflate(
            R.layout.fragment_mv_recommend,
            null
        )
        return layout
    }


}