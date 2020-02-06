package com.zay.music.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

//class BaseViewModel(application: Application): AndroidViewModel(application) {
abstract  class BaseViewModel(): ViewModel() {


    init {

    }

    override fun onCleared() {
        super.onCleared()

    }
}