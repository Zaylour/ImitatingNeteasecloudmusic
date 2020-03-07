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

import com.qmuiteam.qmui.arch.QMUIFragment
import com.zay.music.R
import com.zay.music.util.Util


abstract class QMUIFragmentBinding<T : BaseViewModel<*>> : QMUIFragment() {
    abstract val layoutId: Int
    abstract fun init()
    lateinit var mViewModel : T
    override fun onCreateView(): View {
        val rootView =
            LayoutInflater.from(activity).inflate(layoutId, null)
        mViewModel = ViewModelProvider(this).get(Util.getClass<T>(this))
        init()
        return rootView
    }
}