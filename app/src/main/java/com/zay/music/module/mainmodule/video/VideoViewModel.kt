package com.zay.music.module.mainmodule.video

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.mainmodule.bean.MyPlaylist
import com.zay.music.module.mainmodule.bean.VidedoTagBean
import com.zay.music.module.mainmodule.my.MyRepository

class VideoViewModel(application: Application) : BaseViewModel<VideoRepository>(application) {
    val videoTabsLiveData:MutableLiveData<VidedoTagBean> = MutableLiveData()
    fun getTabs() {
        mRespository.getTabs(videoTabsLiveData)
    }
}