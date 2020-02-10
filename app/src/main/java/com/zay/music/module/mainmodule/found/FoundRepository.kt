package com.zay.music.module.mainmodule.found

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.mainmodule.bean.BannerDataBean
import com.zay.music.module.mainmodule.bean.DjPayBean
import com.zay.music.module.mainmodule.bean.NewSongBaen
import com.zay.music.module.mainmodule.bean.RecommendSongs

open class FoundRepository(val loadState: MutableLiveData<State>) : ApiRepository() {

    fun getBanner(liveData: MutableLiveData<BannerDataBean>) {
        RetrofitManager.instance.api.getBanner(1).execute(BaseObserver(liveData, loadState, this))
    }

    fun personalized(liveData: MutableLiveData<RecommendSongs>){
        RetrofitManager.instance.api.personalized(6).execute(BaseObserver(liveData,loadState,this))
    }

    fun djPay(liveData: MutableLiveData<DjPayBean>){
        RetrofitManager.instance.api.djToplistPay(6).execute(BaseObserver(liveData,loadState,this))
    }

    fun RecommendNewSong(liveData: MutableLiveData<NewSongBaen>){
        RetrofitManager.instance.api.RecommendNewSong().execute(BaseObserver(liveData,loadState,this))
    }


}

