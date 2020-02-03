package com.zay.Music.Module.MainModule.YunCunFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zay.Music.R

class YunCunFragment: Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View? = null
        try {
            view = inflater.inflate(
                R.layout.yuncunfragment_layout,
                container, false)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return view
    }
}