package com.zay.music.module.songsheetmodule

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.bean.SongSheetTagBean
import com.zay.music.module.bean.VidedoTagBean


class SongSheetViewModel (application: Application) : BaseViewModel<SongSheetRepository>(application) {
    val TagLiveData:MutableLiveData<SongSheetTagBean> = MutableLiveData()
    fun getHotSongSheetTag() {
        mRespository.getHotSongSheetTag(TagLiveData)
    }
}