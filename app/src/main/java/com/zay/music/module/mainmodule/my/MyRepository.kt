package com.zay.music.module.mainmodule.my

import androidx.lifecycle.MutableLiveData
import com.tencent.mmkv.MMKV
import com.zay.music.data.*
import com.zay.music.module.bean.MyPlaylist

class MyRepository(val loadState: MutableLiveData<State>) : ApiRepository() {
    var kv = MMKV.defaultMMKV()
    fun getMyPlayList(liveData: MutableLiveData<MyPlaylist>) {
        RetrofitManager.instance.api.myPlaylist(kv.decodeString("userId")).execute(BaseObserver(liveData, loadState, this))
    }
}