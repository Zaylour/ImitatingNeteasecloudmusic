package com.zay.music.module.songsheetmodule.songsheetdetail

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.bean.MyPlaylist

class SSDetailRep (val loadState: MutableLiveData<State>) : ApiRepository() {

    fun getData(liveData:MutableLiveData<SongSheetDeatilBean>,id:String){
        RetrofitManager.instance.api.getSongSheetDetail(id).execute(BaseObserver(liveData, loadState, this))
    }

}