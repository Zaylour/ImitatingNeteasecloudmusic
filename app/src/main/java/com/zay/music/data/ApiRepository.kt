package com.zay.music.data

import com.zay.music.base.BaseRepository

open class ApiRepository : BaseRepository() {

     val api : Api by lazy {
        RetrofitManager.instance.api
    }

}