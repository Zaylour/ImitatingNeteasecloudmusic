package com.zay.music.module.mainmodule.my

import androidx.lifecycle.MutableLiveData
import com.zay.music.data.ApiRepository
import com.zay.music.data.State

class MyRepository(val loadState: MutableLiveData<State>) : ApiRepository() {
}