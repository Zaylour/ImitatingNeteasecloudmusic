package com.zay.music.module.mainmodule.found

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zay.music.base.BaseViewModel
import com.zay.music.data.BaseResponse
import com.zay.music.module.mainmodule.bean.BannerDataBean
import com.zay.music.module.mainmodule.bean.DjPayBean
import com.zay.music.module.mainmodule.bean.RecommendSongs

open class FoundViewModel(application: Application) : BaseViewModel<FoundRepository>(application) {
    var nameLiveData = MutableLiveData<String>();
    //获取banner数据
    var bannerLivedata: MutableLiveData<BannerDataBean> = MutableLiveData()
    fun getBanner() {
        mRespository.getBanner(bannerLivedata)
    }
    //获取精挑细选歌单信息
    var personalizedLivedata: MutableLiveData<RecommendSongs> = MutableLiveData()
    fun personalized(){
        mRespository.personalized(personalizedLivedata)
    }
    var DjPayBeanLivedata: MutableLiveData<DjPayBean> = MutableLiveData()
    fun djPay(){
        mRespository.djPay(DjPayBeanLivedata)
    }



}