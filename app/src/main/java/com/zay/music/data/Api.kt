package com.zay.music.data

import com.zay.music.module.loginmodule.LoginBean
import com.zay.music.module.mainmodule.bean.*
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface Api {
    //手机号密码登录
    @FormUrlEncoded
    @POST("login/cellphone")
    fun loginCellphone(@Field("phone") phone: String,@Field("password") password: String): Observable<LoginBean>

    //获取首页banner
    @FormUrlEncoded
    @POST("banner")
    fun getBanner(@Field("type") type: Int): Observable<BannerDataBean>

    //获取精挑细选歌单信息
    @FormUrlEncoded
    @POST("personalized")
    fun personalized(@Field("limit") limit: Int): Observable<RecommendSongs>

    //电台 - 付费精品
    @FormUrlEncoded
    @POST("dj/toplist/pay")
    fun djToplistPay(@Field("limit") limit: Int): Observable<DjPayBean>

    //推荐新歌
    @POST("personalized/newsong")
    fun RecommendNewSong(): Observable<NewSongBaen>

    //用户自己的歌单
    @FormUrlEncoded
    @POST("user/playlist")
    fun myPlaylist(@Field("uid") uid: String): Observable<MyPlaylist>

    //视频标签集合
    @POST("video/group/list")
    fun videoTagList(): Observable<VidedoTagBean>
}