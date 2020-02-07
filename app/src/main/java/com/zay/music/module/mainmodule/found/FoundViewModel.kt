package com.zay.music.module.mainmodule.found

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zay.music.base.BaseViewModel
import com.zay.music.data.BaseResponse
import com.zay.music.module.mainmodule.bean.BannerDataBean

open class FoundViewModel(application: Application) : BaseViewModel<FoundRepository>(application) {
    var nameLiveData = MutableLiveData<String>();
    //获取banner数据
    var livedata: MutableLiveData<BannerDataBean> = MutableLiveData()

    fun getBanner() {
        mRespository.getBanner(livedata)
    }

}