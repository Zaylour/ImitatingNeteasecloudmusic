package com.zay.music.data;

 public class BaseResponse<T>{
  private int code;


     public int getCode() {
         return code;
     }

     public void setCode(int code) {
         this.code = code;
     }



     @Override
     public String toString() {
         return "BaseResponse{" +
                 "code=" + code +
                 '}';
     }
 }

