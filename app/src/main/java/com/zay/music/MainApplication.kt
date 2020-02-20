package com.zay.music

import android.app.Application
import android.content.Context
import com.didichuxing.doraemonkit.DoraemonKit
import com.facebook.drawee.backends.pipeline.Fresco
import com.tencent.mmkv.MMKV
import com.zay.music.data.RetrofitManager
import me.jessyan.autosize.AutoSizeConfig
import me.jessyan.autosize.unit.Subunits
import org.litepal.LitePal

class MainApplication :Application() {
    companion object{
        var appContext:Context? = null
        var appApplication:Application? = null
    }
    override fun onCreate() {
        super.onCreate()
        appContext=this
        appApplication=this
        //mmkv初始化
        MMKV.initialize(this)
        //网络接口初始化
        RetrofitManager.instance.init()
        //性能检测
        //DoraemonKit.install(this)
        //屏幕适配
        AutoSizeConfig.getInstance().getUnitsManager()
            .setSupportDP(false)
            .setSupportSP(false)
            .setSupportSubunits(Subunits.MM);
        //数据库
        LitePal.initialize(this);
        //Fresco初始化
        Fresco.initialize(this);
    }

}