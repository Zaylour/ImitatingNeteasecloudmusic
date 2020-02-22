package com.zay.music.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zay.music.util.Util

abstract class BaseActivityBinding <T : BaseViewModel<*>,X: ViewDataBinding> : AppCompatActivity() {
    abstract val layoutId: Int
    abstract fun init()
   // lateinit var mViewModel : T
   // lateinit var binding : X

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        binding = DataBindingUtil.setContentView(this,layoutId)
//        binding.lifecycleOwner=this

      //  mViewModel = ViewModelProvider(this).get(Util.getClass<T>(this))
        init()
    }
}