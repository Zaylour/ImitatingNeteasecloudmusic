package com.zay.music.module.mainmodule.bean;

import java.util.List;

public class MyBean {
    // 1:我的音乐布局  2.最近播放  3.创建歌单，收藏歌单
    private int type;
    private Object data;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
