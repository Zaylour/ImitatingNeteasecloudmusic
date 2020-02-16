package com.zay.music.base


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.zay.music.R
import com.zay.music.util.Util

abstract class BaseFragmentBinding<T : BaseViewModel<*>,X: androidx.databinding.ViewDataBinding> : Fragment() {
    abstract val layoutId: Int
    abstract fun init()
    lateinit var mViewModel : T
    lateinit var binding : X


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner=this
        mViewModel = ViewModelProvider(this).get(Util.getClass<T>(this))
        init()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



       // mViewModel.loadState.observe(this,observer)
    }

}