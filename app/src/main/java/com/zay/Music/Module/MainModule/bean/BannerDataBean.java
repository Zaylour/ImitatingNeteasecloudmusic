package com.zay.Music.Module.MainModule.bean;

import com.stx.xhb.androidx.entity.SimpleBannerInfo;

public class BannerDataBean extends SimpleBannerInfo {
    private String imageRes;

    public BannerDataBean(String imageRes) {
        this.imageRes = imageRes;
    }

    public String getImageRes() {
        return imageRes;
    }

    public void setImageRes(String imageRes) {
        this.imageRes = imageRes;
    }

    @Override
    public String toString() {
        return "BannerDataBean{" +
                "imageRes='" + imageRes + '\'' +
                '}';
    }

    @Override
    public Object getXBannerUrl() {
        return imageRes;
    }
}
