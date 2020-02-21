package com.zay.music.module.mainmodule.adapter

import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.qmuiteam.qmui.arch.QMUIFragment
import com.qmuiteam.qmui.arch.QMUIFragmentPagerAdapter
import com.zay.music.module.mainmodule.bean.VidedoTagBean
import com.zay.music.module.mainmodule.video.subFragment.RecommendMvFragment

class VideoPagerAdapter(fm:FragmentManager,behavior:Int , datas:  MutableList<VidedoTagBean.DataBean> )  : FragmentStatePagerAdapter(fm,behavior) {


    var datas= mutableListOf<VidedoTagBean.DataBean>()
    init {
        this.datas.addAll(datas)
    }
    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

//    override fun createFragment(position: Int): QMUIFragment {
//      //  Log.e("ceshiid",  datas.get(position).id.toString())
////        when (position) {
////            0 -> return RecommendMvFragment(0)
////            1 -> return RecommendMvFragment(1)
////            2 -> return RecommendMvFragment(2)
////            3 -> return RecommendMvFragment(3)
////            else -> return RecommendMvFragment(4)
////        }
//
//        return   RecommendMvFragment(
//            datas.get(
//                position
//            ).id
//        )
//    }

    override fun getItem(position: Int): Fragment {
        return   RecommendMvFragment(
            datas.get(
                position
            ).id
        )
    }

    override fun getCount(): Int {
        return datas.size
    }


}