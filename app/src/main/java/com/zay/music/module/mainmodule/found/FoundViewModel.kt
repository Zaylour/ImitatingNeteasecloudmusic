package com.zay.music.module.mainmodule.found

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zay.music.base.BaseViewModel
import com.zay.music.module.mainmodule.bean.BannerDataBean

class FoundViewModel : BaseViewModel(){
    var nameLiveData =  MutableLiveData<String>();
    fun getBanner():MutableLiveData<MutableList<BannerDataBean.BannersBean>> = FoundRepository.Companion.getBanner()

}