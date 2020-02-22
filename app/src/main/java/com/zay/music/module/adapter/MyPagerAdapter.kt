package com.zay.music.module.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zay.music.module.mainmodule.found.FoundFragment
import com.zay.music.module.mainmodule.my.MyFragment
import com.zay.music.module.mainmodule.video.VideoFragment
import com.zay.music.module.mainmodule.yuncun.YunCunFragment

class MyPagerAdapter(fm:FragmentManager,behavior: Int )  : FragmentStatePagerAdapter(fm,behavior) {
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
        return 4
    }


}