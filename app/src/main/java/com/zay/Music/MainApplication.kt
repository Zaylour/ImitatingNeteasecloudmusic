package com.zay.Music

import android.app.Application
import com.tencent.mmkv.MMKV

class MainApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        //mmkv初始化
        MMKV.initialize(this)
    }

}