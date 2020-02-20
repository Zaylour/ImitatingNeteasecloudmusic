package com.zay.music.module.mainmodule.video

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qmuiteam.qmui.arch.QMUIFragment
import com.qmuiteam.qmui.arch.QMUIFragmentPagerAdapter
import com.qmuiteam.qmui.widget.QMUIViewPager
import com.qmuiteam.qmui.widget.tab.QMUITab
import com.zay.music.R
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.databinding.MyfragmentLayoutBinding
import com.zay.music.databinding.VideofragmentLayoutBinding
import com.zay.music.module.mainmodule.my.MyViewModel
import kotlinx.android.synthetic.main.videofragment_layout.*
import com.qmuiteam.qmui.widget.tab.QMUITabSegment
import com.qmuiteam.qmui.util.QMUIDisplayHelper
import com.qmuiteam.qmui.widget.tab.QMUITabIndicator
import androidx.databinding.adapters.TextViewBindingAdapter.setText
import com.qmuiteam.qmui.widget.tab.QMUITabBuilder
import android.widget.Toast
import androidx.databinding.adapters.ViewBindingAdapter.setPadding
import androidx.viewpager.widget.PagerAdapter
import com.qmuiteam.qmui.skin.QMUISkinHelper
import com.zay.music.module.mainmodule.adapter.VideoPagerAdapter


class VideoFragment: BaseFragmentBinding<VideoViewModel, VideofragmentLayoutBinding>() {

    override val layoutId: Int
        get() = R.layout.videofragment_layout

    override fun init() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPagers()
    }
    private fun initPagers() {
        pager.setAdapter(VideoPagerAdapter(childFragmentManager,4))
        pager.setCurrentItem(0, true);
        val tabBuilder = tabs.tabBuilder()

        tabBuilder.setColorAttr(com.qmuiteam.qmui.R.attr.qmui_config_color_black,
            com.qmuiteam.qmui.R.attr.qmui_config_color_red)

       //  resources.getColor(R.color.bannerRed

        tabBuilder.setTypeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD)
        for (i in 0 until 6) {
            tabs.addTab(tabBuilder.setText("Item " + (i + 1)).build(activity))
            tabs.notifyDataChanged();
        }

        val space = QMUIDisplayHelper.dp2px(context!!, 16)
        tabs.setIndicator(
            QMUITabIndicator(
                QMUIDisplayHelper.dp2px(context!!, 2), false, true
            )
        )

        tabs.setItemSpaceInScrollMode(space)
        tabs.setupWithViewPager(pager,false)
        tabs.setPadding(space, 0, space, 0)

        tabs.addOnTabSelectedListener(object : QMUITabSegment.OnTabSelectedListener {
            override fun onTabSelected(index: Int) {
                Toast.makeText(context, "select index $index", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(index: Int) {
                Toast.makeText(context, "unSelect index $index", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(index: Int) {
                Toast.makeText(context, "reSelect index $index", Toast.LENGTH_SHORT).show()
            }

            override fun onDoubleTap(index: Int) {
                Toast.makeText(context, "double tap index $index", Toast.LENGTH_SHORT).show()
            }
        })



    }

}







