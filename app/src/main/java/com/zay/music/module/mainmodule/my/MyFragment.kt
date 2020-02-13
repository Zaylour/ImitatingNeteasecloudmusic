package com.zay.music.module.mainmodule.my


import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.zay.music.R
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.databinding.FoundfragmentLayoutBinding
import com.zay.music.module.mainmodule.adapter.CollectSongAdapter
import kotlinx.android.synthetic.main.foundfragment_layout.*
import kotlinx.android.synthetic.main.myfragment_layout.*

class MyFragment : BaseFragmentBinding<MyViewModel, FoundfragmentLayoutBinding>() {

    override val layoutId: Int
        get() = R.layout.myfragment_layout

    override fun init() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data= mutableListOf<String>()
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        data.add("测试")
        super.onViewCreated(view, savedInstanceState)
        val adapter=CollectSongAdapter()
        val mLinearLayout = LinearLayoutManager(activity)
        reclerview.setLayoutManager(mLinearLayout)
        reclerview.adapter=adapter
        adapter.setNewData(data)

    }

}