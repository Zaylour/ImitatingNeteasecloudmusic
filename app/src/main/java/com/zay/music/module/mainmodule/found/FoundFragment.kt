package com.zay.music.module.mainmodule.found

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.stx.xhb.androidx.XBanner
import com.zay.music.module.mainmodule.bean.BannerDataBean
import com.zay.music.R
import kotlinx.android.synthetic.main.foundfragment_layout.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.zay.music.base.BaseFragmentBinding

import com.zay.music.databinding.FoundfragmentLayoutBinding
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

import com.bumptech.glide.request.RequestOptions









class FoundFragment : BaseFragmentBinding() {
    lateinit var binding: FoundfragmentLayoutBinding
     var model: FoundViewModel=FoundViewModel()
    val roundedCorners = RoundedCorners(20)
    val options = RequestOptions.bitmapTransform(roundedCorners).dontAnimate()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.foundfragment_layout, container, false)
        binding.lifecycleOwner=this
        model = ViewModelProvider(this).get(FoundViewModel::class.java)
        binding.foundViewModel = model
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBanner()
        test.setOnClickListener {
            model.nameLiveData.value = "ViewModel配合LiveData使用"
        }
    }
    //初始化banner
    fun initBanner() {
        model.getBanner().observe(binding.lifecycleOwner!!,object : Observer<MutableList<BannerDataBean.BannersBean>>{
            override fun onChanged(t: MutableList<BannerDataBean.BannersBean>?) {
                //添加轮播图片数据（图片数据不局限于网络图片、本地资源文件、View 都可以）,刷新数据也是调用该方法
                xbanner.setBannerData(t!!);

            }

        })
        //加载广告图片
        xbanner.loadImage(XBanner.XBannerAdapter { banner, model, view, position ->
            //1、此处使用的Glide加载图片，可自行替换自己项目中的图片加载框架
            //2、返回的图片路径为Object类型，你只需要强转成你传输的类型就行，切记不要胡乱强转！

            Glide.with(context!!)
                .setDefaultRequestOptions(options)
                .load((model as BannerDataBean.BannersBean).getXBannerUrl())
                .into(view as ImageView)
        })
        xbanner.setOnItemClickListener(XBanner.OnItemClickListener { banner, model, view, position ->
            Toast.makeText(
                context,
                "点击了第" + position + "图片",
                Toast.LENGTH_SHORT
            ).show()
        })
    }


}