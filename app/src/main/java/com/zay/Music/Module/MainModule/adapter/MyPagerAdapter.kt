package com.zay.Music.Module.MainModule.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zay.Music.Module.MainModule.FoundFragment.FoundFragment
import com.zay.Music.Module.MainModule.MyFragment.MyFragment
import com.zay.Music.Module.MainModule.VideoFragment.VideoFragment
import com.zay.Music.Module.MainModule.YunCunFragment.YunCunFragment

class MyPagerAdapter(fm:FragmentManager,nNumOfTabs:Int )  : FragmentPagerAdapter(fm,nNumOfTabs) {
    //fragment的数量
    var nNumOfTabs: Int = 0
    init {
        this.nNumOfTabs=nNumOfTabs
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return MyFragment()
            }
            1 -> {
                return FoundFragment()
            }
            2 -> {
                return YunCunFragment()
            }
            3 -> {
                return VideoFragment()
            }
            else->{
                return FoundFragment()
            }
        }
    }

    override fun getCount(): Int {
        return nNumOfTabs
    }


}