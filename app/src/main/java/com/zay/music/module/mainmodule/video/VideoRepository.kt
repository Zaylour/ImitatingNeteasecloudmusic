package com.zay.music.module.mainmodule.video

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.mainmodule.bean.MyPlaylist
import com.zay.music.module.mainmodule.bean.VidedoTagBean

class VideoRepository(val loadState: MutableLiveData<State>) : ApiRepository() {

    fun getTabs(liveData: MutableLiveData<VidedoTagBean>) {
        RetrofitManager.instance.api.videoTagList().execute(
            BaseObserver(liveData, loadState, this)
        )
    }
}