package com.zay.music.util

import android.view.Gravity
import android.widget.Toast
import com.zay.music.MainApplication.Companion.appContext

class ToastMessage {
    companion object {
        fun show(msg:String){
            val  toast = Toast.makeText(appContext, msg,Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }
}