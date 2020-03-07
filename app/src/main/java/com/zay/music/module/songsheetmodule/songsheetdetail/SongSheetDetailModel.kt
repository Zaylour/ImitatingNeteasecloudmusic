package com.zay.music.module.songsheetmodule.songsheetdetail

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.bean.MyPlaylist
import com.zay.music.module.mainmodule.my.MyRepository

class SongSheetDetailModel(application: Application) : BaseViewModel<SSDetailRep>(application) {

    val dataLiveData: MutableLiveData<SongSheetDeatilBean> = MutableLiveData()
    fun getData(id: String) {
        mRespository.getData(dataLiveData, id)
    }


}