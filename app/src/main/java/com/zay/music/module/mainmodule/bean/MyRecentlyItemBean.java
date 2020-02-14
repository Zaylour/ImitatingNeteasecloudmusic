package com.zay.music.module.mainmodule.bean;

public class MyRecentlyItemBean {
    private String img1;
    private String img2;
    private String num;//播放了几首
    private String nameB;//最近播放的视频，电台等名称
    private String nameC;//可能为空格，有可能是继续播放等文案

    public MyRecentlyItemBean(String img1, String img2, String num, String nameB, String nameC) {
        this.img1 = img1;
        this.img2 = img2;
        this.num = num;
        this.nameB = nameB;
        this.nameC = nameC;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    @Override
    public String toString() {
        return "MyRecentlyItemBean{" +
                "img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", num='" + num + '\'' +
                ", nameB='" + nameB + '\'' +
                ", nameC='" + nameC + '\'' +
                '}';
    }
}
