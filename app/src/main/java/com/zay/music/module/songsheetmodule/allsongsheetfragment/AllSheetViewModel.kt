package com.zay.music.module.songsheetmodule.allsongsheetfragment

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zay.music.base.BaseViewModel
import com.zay.music.data.BaseObserver
import com.zay.music.data.RetrofitManager
import com.zay.music.data.execute
import com.zay.music.module.bean.SheetBean
import com.zay.music.module.bean.VidedoTagBean
import com.zay.music.module.mainmodule.video.VideoRepository

class AllSheetViewModel (application: Application) : BaseViewModel<AllSheetRespository>(application) {
    val topPlaylistLiveData:MutableLiveData<SheetBean> = MutableLiveData()
    fun getTopPlaylist( tag:String) {
      mRespository.getTopPlaylist(topPlaylistLiveData,tag)
    }

}