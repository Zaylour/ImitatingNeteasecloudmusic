package com.zay.music.module.bean;

public class MyMusicItemBean {
    private int imgUrl;
    private String nameA;
    private String nameB;
    private String nameC;

    public MyMusicItemBean(int imgUrl, String nameA, String nameB, String nameC) {
        this.imgUrl = imgUrl;
        this.nameA = nameA;
        this.nameB = nameB;
        this.nameC = nameC;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
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
        return "MyMusicItemBean{" +
                "imgUrl='" + imgUrl + '\'' +
                ", nameA='" + nameA + '\'' +
                ", nameB='" + nameB + '\'' +
                ", nameC='" + nameC + '\'' +
                '}';
    }
}
