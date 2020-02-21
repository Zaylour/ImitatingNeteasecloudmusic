package com.zay.music.module.mainmodule.video.subFragment

import android.text.TextUtils
import android.util.Log
import android.view.View
import com.qmuiteam.qmui.arch.QMUIFragment

import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.zay.music.R
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.base.QMUIFragmentBinding
import com.zay.music.databinding.FragmentMvRecommendBinding
import com.zay.music.databinding.FragmentMvRecommendBindingImpl
import com.zay.music.databinding.VideofragmentLayoutBinding
import com.zay.music.module.mainmodule.adapter.MvAdapter
import com.zay.music.module.mainmodule.adapter.PersonalizedAdapter
import com.zay.music.module.mainmodule.found.SpacesItemDecoration
import com.zay.music.module.mainmodule.video.VideoViewModel
import com.zay.music.util.ToastMessage
import kotlinx.android.synthetic.main.fragment_mv_recommend.*


class RecommendMvFragment(tabId: Int) :
    BaseFragmentBinding<MvViewModel, FragmentMvRecommendBinding>() , LifecycleOwner {
    override val layoutId: Int
        get() = R.layout.fragment_mv_recommend
    var tabId = 0
    private var isLoaded = false

    lateinit var mvAdapter:MvAdapter
    init {
        this.tabId = tabId
    }

    override fun init() {

    }


    override fun onResume() {
        super.onResume()
        if (!isLoaded) {
            initDatas()
            isLoaded = true
        }
    }
    fun initDatas(){
        mvAdapter = MvAdapter()
        val mLinearLayout = LinearLayoutManager(activity)
        mRecyclerView.setLayoutManager(mLinearLayout)
        mRecyclerView.adapter=mvAdapter

        mViewModel.getVideoList(tabId)
        mViewModel.mvLiveData.observe(binding.lifecycleOwner!!, Observer {
            mvAdapter.data.clear()
           // Log.e("tabId","tabId="+tabId+"   title="+it.datas.get(0).data.title)
            mvAdapter.setNewData(it.datas)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        isLoaded = false
    }

}