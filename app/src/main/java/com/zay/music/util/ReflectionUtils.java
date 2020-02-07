package com.zay.music.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/**
 * @Description:通过反射，获取class声明的父类的泛型参数类型
 * 如：public B extends A<String>
 * @author linluor
 */
public class ReflectionUtils {
    private static Class getSuperClassGenericType(Class clazz,int index) {
        Type genType = clazz.getGenericSuperclass();
        if(!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
        if(index >= params.length || index < 0) {
            return Object.class;
        }
        if(!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }

    public static<T> Class<T> getSuperClassGenericType(Class clazz){
        Class aClass = getSuperClassGenericType(clazz, 0);
        return aClass;
    }

}

