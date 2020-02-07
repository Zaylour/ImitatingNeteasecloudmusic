package com.zay.music.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zay.music.MainApplication
import com.zay.music.data.State
import com.zay.music.util.Util

open class BaseViewModel<T : BaseRepository>(application: Application) : AndroidViewModel(application){
    val loadState by lazy { MutableLiveData<State>()}
    val mRespository : T by lazy {

        (Util.getClass<T>(this)).getDeclaredConstructor(MutableLiveData::class.java)
            .newInstance(loadState)

    }
    override fun onCleared() {
        super.onCleared()
        mRespository.unSubscribe()
    }
}