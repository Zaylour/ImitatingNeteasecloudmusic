package com.zay.music.module.songsheetmodule.allsongsheetfragment

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.bean.SheetBean
import com.zay.music.module.bean.VidedoTagBean

class AllSheetRespository (val loadState: MutableLiveData<State>) : ApiRepository() {

    fun getTopPlaylist(liveData: MutableLiveData<SheetBean>,tag:String) {
        RetrofitManager.instance.api.getTopPlaylist(24,tag,System.currentTimeMillis().toString()).execute(
            BaseObserver(liveData, loadState, this)
        )
    }

}