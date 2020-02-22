package com.zay.music.data
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.orhanobut.logger.BuildConfig
import com.zay.music.base.BaseRepository
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
class BaseObserver<T : BaseResponse<*>>(
    private val liveData: MutableLiveData<T>,
    private val loadState: MutableLiveData<State>,
    private val repository: BaseRepository
) : Observer<T> {
    val TAG = "errorMsg"
    override fun onComplete() {
    }
    override fun onSubscribe(d: Disposable) {
        repository.subscribe(d)
    }
    override fun onNext(response: T) {


        when (response.code) {
            Constant.SUCCESS -> {
//                if (response.data is List<*>) {
//                    if ((response.data as List<*>).isEmpty()) {
//                        loadState.postValue(State(StateType.EMPTY))
//                        return
//                    }
//                }
                loadState.postValue(State(StateType.SUCCESS))
                liveData.postValue(response)
            }
            else -> {
                loadState.postValue(State(StateType.ERROR, msg = "服务器繁忙,请稍后再试"))
            }
        }
    }
    override fun onError(e: Throwable) {
        if (BuildConfig.DEBUG) {
            e.message?.let { Log.e(TAG,it) }
        }
        loadState.postValue(State(StateType.ERROR))
    }
}