package com.zay.music.data

import android.util.Log
import com.orhanobut.logger.Logger
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitManager {
    lateinit var api: Api

    private object Holder {
        val INSTANCE = RetrofitManager()
    }

    companion object {
        val instance by lazy { Holder.INSTANCE }
    }

    //懒加载
    fun init() {
        val builder = OkHttpClient.Builder().connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
        val logging = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger {
            //这里打印的是网络请求过程的信息
           // Logger.t("apiData").e(it.toString())
            Log.e("apiData",it.toString())
        })
        logging.level = HttpLoggingInterceptor.Level.BODY
        builder.addInterceptor(logging)
        val okHttpClient = builder.build()
        //配置retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.gzfubin.com:3000/") //基本的url
            .addConverterFactory(GsonConverterFactory.create()) //使用gson
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//使用rxjava
            .client(okHttpClient)
            .build()
        api = retrofit.create(Api::class.java)
    }

}