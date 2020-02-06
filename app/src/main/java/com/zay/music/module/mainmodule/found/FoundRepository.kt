package com.zay.music.module.mainmodule.found

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.zay.music.data.RetrofitManager
import com.zay.music.module.mainmodule.bean.BannerDataBean
import com.zay.music.util.ToastMessage
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers


class FoundRepository {
    companion object{
        private val instance = FoundRepository()
        var bannerApi: Disposable? = null
        fun getInstance(): FoundRepository {
            return instance
        }
        fun getBanner() :MutableLiveData<MutableList<BannerDataBean.BannersBean>>{
            val livedata = MutableLiveData<MutableList<BannerDataBean.BannersBean>>()
            bannerApi = RetrofitManager.instance.api.getBanner(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Consumer<BannerDataBean> {
                    override fun accept(data: BannerDataBean?) {
                        livedata.postValue(data!!.banners)
                    }
                }, object : Consumer<Throwable> {
                    override fun accept(throwable: Throwable?) {
                        if (throwable is Exception) {
                            Log.e("xception", "网络错误!" + throwable.message);
                            ToastMessage.show("服务器繁忙,请稍后再试");
                        }
                    }
                })

            return livedata
        }
    }


}

