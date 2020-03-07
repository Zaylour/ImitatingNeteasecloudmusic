package com.zay.music.util

import android.util.Log
import com.blankj.utilcode.util.StringUtils
import java.lang.reflect.ParameterizedType
import java.util.*
import java.math.BigDecimal


object Util {
    fun <T> getClass(t: Any): Class<T> {
        // 通过反射 获取父类泛型 (T) 对应 Class类  如：public B extends A<String>
        return (t::class.java.genericSuperclass as ParameterizedType)
            .actualTypeArguments[0] as Class<T>
    }


    fun formatNum(num: String, kBool: Boolean?): String {
        var kBool = kBool
        val sb = StringBuffer()
        if (kBool == null)
            kBool = false
        val b0 = BigDecimal("1000")
        val b1 = BigDecimal("10000")
        val b2 = BigDecimal("100000000")
        val b3 = BigDecimal(num)
        var formatNumStr = ""
        var nuit = ""
        // 以千为单位处理
        if (kBool) {
            return if (b3.compareTo(b0) == 0 || b3.compareTo(b0) == 1) {
                "999+"
            } else num
        }

        // 以万为单位处理
        if (b3.compareTo(b1) == -1) {
            sb.append(b3.toString())
        } else if (b3.compareTo(b1) == 0 && b3.compareTo(b1) == 1 || b3.compareTo(b2) == -1) {
            formatNumStr = b3.divide(b1).toString()
            nuit = "万"
        } else if (b3.compareTo(b2) == 0 || b3.compareTo(b2) == 1) {
            formatNumStr = b3.divide(b2).toString()
            nuit = "亿"
        }
        if ("" != formatNumStr) {
            var i = formatNumStr.indexOf(".")
            if (i == -1) {
                sb.append(formatNumStr).append(nuit)
            } else {
                i = i + 1
                val v = formatNumStr.substring(i, i + 1)
                if (v != "0") {
                    sb.append(formatNumStr.substring(0, i + 1)).append(nuit)
                } else {
                    sb.append(formatNumStr.substring(0, i - 1)).append(nuit)
                }
            }
        }
        return if (sb.length == 0) "0" else sb.toString()
    }


}