package com.zay.music.module.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.zay.music.module.bean.VidedoTagBean
import com.zay.music.module.mainmodule.video.subFragment.RecommendMvFragment

class VideoPagerAdapter(
    fm: FragmentManager,
    behavior: Int,
    datas: MutableList<VidedoTagBean.DataBean>
) : FragmentStatePagerAdapter(fm, behavior) {

    var datas = mutableListOf<VidedoTagBean.DataBean>()

    init {
        this.datas.addAll(datas)
    }

    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

    override fun getItem(position: Int): Fragment {
        return RecommendMvFragment.instance(
            datas.get(
                position
            ).id
        )
    }

    override fun getCount(): Int {
        return datas.size
    }
}