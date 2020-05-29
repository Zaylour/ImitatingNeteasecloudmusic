package com.zay.music.data
import com.zay.music.module.loginmodule.LoginBean
import com.zay.music.module.bean.*
import com.zay.music.module.songsheetmodule.songsheetdetail.SongSheetDeatilBean
import io.reactivex.Observable
import retrofit2.http.*
interface Api {
    //手机号密码登录
    @FormUrlEncoded
    @POST("login/cellphone")
    fun loginCellphone(
        @Field("phone") phone: String,
        @Field("password") password: String
    ): Observable<LoginBean>

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

    //获取标签下的视频集合
   // @FormUrlEncoded
    @GET("video/group")
    @Headers(
        "withCredentials: true",
        "Cache-Control:no-cache",
        "Cookie:__remember_me=true; MUSIC_U=8907d9c36a20e0a0f29f5057a869acadc5823538602a28893e58249a6c58b356865dcd073c99191eb118e32d612bfb9441049cea1c6bb9b6; __csrf=ea1aa90baf42bf214397b7d60b2a5222"
    )
    fun getVideoList(@Query("id") id: Int, @Query("timestamp") time: String): Observable<MvBean>


    //热门歌单分类标签
    @GET("playlist/catlist")
    fun getHotSongSheetTag(): Observable<SongSheetTagBean>

    //歌单分类下的内容
    @GET("top/playlist")
    fun getTopPlaylist(
        @Query("limit") limit: Int,
        @Query("tag") tag: String,
        @Query("timestamp") timestamp: String
    ): Observable<SheetBean>

    //歌单的详情
    @GET("playlist/detail")
    fun getSongSheetDetail(@Query("id") id: String, @Query("timestamp") time: String): Observable<SongSheetDeatilBean>

}