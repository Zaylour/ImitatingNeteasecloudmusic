package com.zay.music.module.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zay.music.module.bean.SongSheetTagBean
import com.zay.music.module.bean.VidedoTagBean
import com.zay.music.module.mainmodule.video.subFragment.RecommendMvFragment
import com.zay.music.module.songsheetmodule.allsongsheetfragment.AllSongSheet

class SongSheetPagerAdapter(
    fm: FragmentManager,
    behavior: Int,
    datas: MutableList<SongSheetTagBean.SubBean>
) : FragmentStatePagerAdapter(fm, behavior) {

    var datas = mutableListOf<SongSheetTagBean.SubBean>()

    init {
        this.datas.addAll(datas)
    }

    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

    override fun getItem(position: Int): Fragment {
        return AllSongSheet.instance(
            position,
            datas.get(
                position
            ).name
        )
    }

    override fun getCount(): Int {
        return datas.size
    }


}