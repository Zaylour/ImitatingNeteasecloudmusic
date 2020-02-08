package com.zay.music.module.mainmodule.found

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.zay.music.module.mainmodule.bean.BannerDataBean
import com.zay.music.R
import kotlinx.android.synthetic.main.foundfragment_layout.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.databinding.FoundfragmentLayoutBinding
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.zay.music.module.mainmodule.adapter.DjPayAdapter
import com.zay.music.module.mainmodule.adapter.PersonalizedAdapter

class FoundFragment : BaseFragmentBinding<FoundViewModel>() {
    lateinit var binding: FoundfragmentLayoutBinding
    lateinit var personalizedAdapter:PersonalizedAdapter
    lateinit var djPayAdapter: DjPayAdapter
    val roundedCorners = RoundedCorners(20)
    val options = RequestOptions.bitmapTransform(roundedCorners).dontAnimate()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.foundfragment_layout, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.foundViewModel = mViewModel
        initBanner()
        initPersonalized()
        initDjPay()
        test.setOnClickListener {
            mViewModel.nameLiveData.value = "ViewModel配合LiveData使用"
        }
    }

    //初始化banner
    fun initBanner() {
        mViewModel.getBanner()
        mViewModel.bannerLivedata.observe(binding.lifecycleOwner!!, Observer {
            //添加轮播图片数据（图片数据不局限于网络图片、本地资源文件、View 都可以）,刷新数据也是调用该方法
            xbanner.setBannerData(it.banners);
        })
        //加载广告图片
        xbanner.loadImage({ banner, model, view, position ->
            Glide.with(context!!)
                .setDefaultRequestOptions(options)
                .load((model as BannerDataBean.BannersBean).getXBannerUrl())
                .into(view as ImageView)
        })
        xbanner.setOnItemClickListener({ banner, model, view, position ->
            Toast.makeText(
                context,
                "点击了第" + position + "图片",
                Toast.LENGTH_SHORT
            ).show()
        })
    }
    //初始化精挑细选歌单信息
    fun initPersonalized(){
        personalizedAdapter = PersonalizedAdapter()
        val mLinearLayout = LinearLayoutManager(activity)
        mLinearLayout.orientation=LinearLayoutManager.HORIZONTAL
        personalizedReccyView.setLayoutManager(mLinearLayout)
        personalizedReccyView.adapter=personalizedAdapter
        personalizedReccyView.addItemDecoration(SpacesItemDecoration())
        mViewModel.personalized()
        mViewModel.personalizedLivedata.observe(binding.lifecycleOwner!!,Observer{
            personalizedAdapter.setNewData(it.result)
        })

    }
    //初始化电台推荐
    fun initDjPay(){
        djPayAdapter= DjPayAdapter()
        val mLinearLayout = LinearLayoutManager(activity)
        mLinearLayout.orientation=LinearLayoutManager.HORIZONTAL
        djReccyView.setLayoutManager(mLinearLayout)
        djReccyView.adapter=djPayAdapter
        djReccyView.addItemDecoration(SpacesItemDecoration())
        mViewModel.djPay()
        mViewModel.DjPayBeanLivedata.observe(binding.lifecycleOwner!!, Observer {
            djPayAdapter.setNewData(it.data.list)
        })
    }



}