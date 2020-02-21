package com.zay.music.module.mainmodule.video.subFragment

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.tencent.mmkv.MMKV
import com.zay.music.data.*
import com.zay.music.module.mainmodule.bean.MvBean


class MvRepository (val loadState: MutableLiveData<State>) : ApiRepository() {
    fun getVideoList(liveData: MutableLiveData<MvBean>,id:Int){
        Log.e("tabId","tabId="+id)
        RetrofitManager.instance.api.getVideoList(id).execute(
            BaseObserver(liveData, loadState, this)
        )
    }
}