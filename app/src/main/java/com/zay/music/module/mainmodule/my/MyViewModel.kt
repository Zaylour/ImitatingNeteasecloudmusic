package com.zay.music.module.mainmodule.my

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.mainmodule.bean.BannerDataBean
import com.zay.music.module.mainmodule.bean.MyPlaylist
import com.zay.music.module.mainmodule.found.FoundRepository

class MyViewModel(application: Application) : BaseViewModel<MyRepository>(application) {
    val playListLiveData:MutableLiveData<MyPlaylist> = MutableLiveData()
    fun getMyPlayList() {
        mRespository.getMyPlayList(playListLiveData)
    }

}