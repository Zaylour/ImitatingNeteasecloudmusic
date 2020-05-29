package com.zay.music.module.mainmodule.video.subFragment

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.zay.music.data.*
import com.zay.music.module.bean.MvBean
import java.util.*
class MvRepository (val loadState: MutableLiveData<State>) : ApiRepository() {
    fun getVideoList(liveData: MutableLiveData<MvBean>,id:Int){
        Log.e("tabId","tabId="+id)
        RetrofitManager.instance.api.getVideoList(id,System.currentTimeMillis().toString()).execute(
            BaseObserver(liveData, loadState, this)
        )
    }
}