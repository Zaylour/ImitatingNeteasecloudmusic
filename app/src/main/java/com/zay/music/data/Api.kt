package com.zay.music.data

import com.zay.music.module.mainmodule.bean.BannerDataBean
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST


interface Api {
    @FormUrlEncoded
    @POST("banner")
    fun getBanner(@Field("type") type: Int): Observable<BannerDataBean>




}