package com.zay.music.module.mainmodule.yuncun

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zay.music.R
import com.zay.music.util.ToastMessage
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


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // context!!.getDrawable(R.mipmap.ic_launcher)
     //   btn.setImageResource(R.mipmap.ic_launcher)
       // btn.setImageDrawable(R.mipmap.ic_launcher)



    }


}