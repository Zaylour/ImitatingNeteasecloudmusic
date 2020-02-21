package com.zay.music.module.mainmodule.video.subFragment

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.module.mainmodule.bean.MvBean
import com.zay.music.module.mainmodule.bean.VidedoTagBean

class MvViewModel (application: Application) : BaseViewModel<MvRepository>(application) {
    val mvLiveData: MutableLiveData<MvBean> = MutableLiveData()
    fun getVideoList(id:Int) {
        mRespository.getVideoList(mvLiveData,id)
    }
}