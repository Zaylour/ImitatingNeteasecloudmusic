package com.zay.music.module.mainmodule.my

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.bean.MyPlaylist

class MyViewModel(application: Application) : BaseViewModel<MyRepository>(application) {
    val playListLiveData:MutableLiveData<MyPlaylist> = MutableLiveData()
    fun getMyPlayList() {
        mRespository.getMyPlayList(playListLiveData)
    }

}