package com.zay.music.module.mainmodule.adapter

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.qmuiteam.qmui.arch.QMUIFragment
import com.qmuiteam.qmui.arch.QMUIFragmentPagerAdapter
import com.zay.music.module.mainmodule.found.FoundFragment
import com.zay.music.module.mainmodule.found.FoundViewModel
import com.zay.music.module.mainmodule.my.MyFragment
import com.zay.music.module.mainmodule.video.RecommendMvFragment
import com.zay.music.module.mainmodule.video.VideoFragment
import com.zay.music.module.mainmodule.yuncun.YunCunFragment

class VideoPagerAdapter(fm:FragmentManager, nNumOfTabs:Int )  : QMUIFragmentPagerAdapter(fm) {
    //fragment的数量
    var nNumOfTabs: Int = 0
    init {
        this.nNumOfTabs=nNumOfTabs
    }
    override fun getItemPosition(`object`: Any): Int {

        return super.getItemPosition(`object`)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun createFragment(position: Int): QMUIFragment {
        when (position) {
            0 -> return RecommendMvFragment()
            1 -> return RecommendMvFragment()
            2 -> return RecommendMvFragment()
            3 -> return RecommendMvFragment()
            else -> return RecommendMvFragment()
        }
    }

    override  fun getPageTitle(position: Int): CharSequence {
        when (position) {
            0 -> return "推荐"
            1 -> return "武汉加油"
            2 -> return "想见你"
            3 -> return "现场"
            else -> return "推荐"
        }
    }
    override fun getCount(): Int {
        return nNumOfTabs
    }


}