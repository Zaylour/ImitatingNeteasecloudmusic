package com.zay.music.module.mainmodule.yuncun

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zay.music.R
import com.blankj.utilcode.util.ShadowUtils
import com.blankj.utilcode.util.ShadowUtils.Config
import com.blankj.utilcode.util.ToastUtils
import kotlinx.android.synthetic.main.yuncunfragment_layout.*

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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ShadowUtils.apply(testtv, Config().setShadowRadius(0.01f).setShadowColor(
            Color.parseColor("#E1E1E1"), Color.RED)  )
        testtv.setOnClickListener {
            ToastUtils.showShort("哈哈哈")

        }


    }


}