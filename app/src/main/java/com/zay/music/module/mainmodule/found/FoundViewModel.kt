package com.zay.music.module.mainmodule.found

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.bean.BannerDataBean
import com.zay.music.module.bean.DjPayBean
import com.zay.music.module.bean.NewSongBaen
import com.zay.music.module.bean.RecommendSongs

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

    //推荐新歌
    var NewSongLiveData: MutableLiveData<NewSongBaen> = MutableLiveData()
    fun RecommendNewSong(){
        mRespository.RecommendNewSong(NewSongLiveData)
    }

}