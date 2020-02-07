package com.zay.music.data;

 public class BaseResponse<T>{
  private int code;
  private T data;

     public int getCode() {
         return code;
     }

     public void setCode(int code) {
         this.code = code;
     }

     public T getData() {
         return data;
     }

     public void setData(T data) {
         this.data = data;
     }

     @Override
     public String toString() {
         return "BaseResponse{" +
                 "code=" + code +
                 ", data=" + data +
                 '}';
     }
 }

