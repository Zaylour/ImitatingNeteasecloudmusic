package com.zay.music.module.songsheetmodule

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.bean.SongSheetTagBean
import com.zay.music.module.bean.VidedoTagBean

class SongSheetRepository (val loadState: MutableLiveData<State>) : ApiRepository() {

    fun getHotSongSheetTag(liveData: MutableLiveData<SongSheetTagBean>) {
        RetrofitManager.instance.api.getHotSongSheetTag().execute(
            BaseObserver(liveData, loadState, this)
        )
    }

}