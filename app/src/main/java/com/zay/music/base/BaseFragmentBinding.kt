package com.zay.music.base


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.zay.music.util.Util

abstract class BaseFragmentBinding<T : BaseViewModel<*>> : Fragment() {

    lateinit var mViewModel : T
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewModel = ViewModelProvider(this).get(Util.getClass<T>(this))
       // mViewModel.loadState.observe(this,observer)
    }

}