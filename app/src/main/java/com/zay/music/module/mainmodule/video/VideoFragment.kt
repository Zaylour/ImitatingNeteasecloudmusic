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
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.lifecycle.Observer
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.qmuiteam.qmui.skin.QMUISkinHelper
import com.zay.music.module.mainmodule.adapter.VideoPagerAdapter
import com.zay.music.module.mainmodule.bean.VidedoTagBean
import kotlinx.android.synthetic.main.activity_main.*


class VideoFragment: BaseFragmentBinding<VideoViewModel, VideofragmentLayoutBinding>() {
    override val layoutId: Int   get() = R.layout.videofragment_layout
    private var isLoaded = false
    var pagerAdapter:VideoPagerAdapter?=null
    override fun init() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        if (!isLoaded) {
            initPagers()
            isLoaded = true
        }
    }

    private fun initPagers() {
        //获取标签
        mViewModel.getTabs()
        mViewModel.videoTabsLiveData.observe(binding.lifecycleOwner!!, Observer {
            val subList = it.data.subList(0, 12)
            pagerAdapter = VideoPagerAdapter(childFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT  , subList)
            pager.setAdapter(pagerAdapter)
            pager.setCurrentItem(0, true);
            val tabBuilder = tabs.tabBuilder()
            tabBuilder.setColorAttr(com.qmuiteam.qmui.R.attr.qmui_config_color_black,
                com.qmuiteam.qmui.R.attr.qmui_config_color_red)
            tabBuilder.setTypeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD)
            tabs.reset()
            for (i in 0 until  subList.size) {
                tabs.addTab(tabBuilder.setText(it.data.get(i).name).build(activity))
                tabs.notifyDataChanged();
            }
            val space = QMUIDisplayHelper.dp2px(context!!, 16)
            tabs.setIndicator(
                QMUITabIndicator(
                    QMUIDisplayHelper.dp2px(context!!, 2), false, true
                )
            )
            tabs.setupWithViewPager(pager,false,true)
            tabs.setItemSpaceInScrollMode(space)
            tabs.setPadding(space, 0, space, 0)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        isLoaded = false
    }
}







