package com.zay.music.module.mainmodule.video.subFragment

import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zay.music.R
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.databinding.FragmentMvRecommendBinding
import com.zay.music.module.adapter.MvAdapter
import kotlinx.android.synthetic.main.fragment_mv_recommend.*
import com.shuyu.gsyvideoplayer.GSYVideoManager


class RecommendMvFragment() :
    BaseFragmentBinding<MvViewModel, FragmentMvRecommendBinding>() {
    override val layoutId: Int
        get() = R.layout.fragment_mv_recommend
    private var isLoaded = false
    lateinit var mvAdapter: MvAdapter
    var tabId = 0
    constructor(tabId: Int):this(){
        this.tabId=tabId
    }
    companion object{
        fun instance(tabId: Int):RecommendMvFragment{
            return RecommendMvFragment(tabId)
        }
    }

    override fun init() {

    }


    override fun onResume() {
        super.onResume()
        if (!isLoaded) {
            initDatas()
            isLoaded = true
            //GSYVideoManager.onResume()
        }
    }

    fun initDatas() {
        mvAdapter = MvAdapter()
        val mLinearLayout = LinearLayoutManager(activity)
        mRecyclerView.setLayoutManager(mLinearLayout)
        mRecyclerView.adapter = mvAdapter
        mViewModel.getVideoList(tabId)
        mViewModel.mvLiveData.observe(binding.lifecycleOwner!!, Observer {
            mvAdapter.data.clear()
            mvAdapter.setNewData(it.datas)
        })
        mRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
//                val lastVisibleItem = dx + dy
//                //大于0说明有播放
//                if (GSYVideoManager.instance().playPosition >= 0) {
//                    //当前播放的位置
//                    val position = GSYVideoManager.instance().playPosition
//
//                    if (GSYVideoManager.instance().getPlayTag().equals(mvAdapter.data.get(position).data.urlInfo.id)
//                        && (position < dx || position > lastVisibleItem)) {
//                        if (GSYVideoManager.isFullState(activity)) {
//                            return;
//                        }
//                        //如果滑出去了上面和下面就是否，和今日头条一样
//                        GSYVideoManager.releaseAllVideos();
//                        mvAdapter.notifyDataSetChanged();
//                    }
//                }
            }
        })
    }


    override fun onPause() {
        super.onPause()
        //GSYVideoManager.onPause();
    }


    override fun onDestroyView() {
        super.onDestroyView()
        isLoaded = false
        //GSYVideoManager.releaseAllVideos();
    }

}