package com.zay.music.util

import android.util.Log
import java.lang.reflect.ParameterizedType
import java.util.*

object Util {
    fun <T> getClass(t: Any): Class<T> {
        // 通过反射 获取父类泛型 (T) 对应 Class类  如：public B extends A<String>
        return (t::class.java.genericSuperclass as ParameterizedType)
            .actualTypeArguments[0] as Class<T>
    }
}