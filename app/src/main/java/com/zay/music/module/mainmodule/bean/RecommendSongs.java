package com.zay.music.module.mainmodule.bean;

import com.zay.music.data.BaseResponse;

import java.util.List;

public class RecommendSongs extends BaseResponse {


    /**
     * hasTaste : false
     * category : 0
     * result : [{"id":3060659920,"type":0,"name":"英伦情调|深海中的温柔孤岛","copywriter":"编辑推荐：星星挂在天幕上面，像世界之灯，永远安全。","picUrl":"https://p2.music.126.net/qrq_4i-07LdYd8rUjvnxbg==/109951164469899079.jpg","canDislike":false,"trackNumberUpdateTime":1580972407414,"playCount":543260,"trackCount":41,"highQuality":false,"alg":"featured"}]
     */

    private boolean hasTaste;
    private int category;
    private List<ResultBean> result;

    public boolean isHasTaste() {
        return hasTaste;
    }

    public void setHasTaste(boolean hasTaste) {
        this.hasTaste = hasTaste;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 3060659920
         * type : 0
         * name : 英伦情调|深海中的温柔孤岛
         * copywriter : 编辑推荐：星星挂在天幕上面，像世界之灯，永远安全。
         * picUrl : https://p2.music.126.net/qrq_4i-07LdYd8rUjvnxbg==/109951164469899079.jpg
         * canDislike : false
         * trackNumberUpdateTime : 1580972407414
         * playCount : 543260
         * trackCount : 41
         * highQuality : false
         * alg : featured
         */

        private long id;
        private int type;
        private String name;
        private String copywriter;
        private String picUrl;
        private boolean canDislike;
        private long trackNumberUpdateTime;
        private int playCount;
        private int trackCount;
        private boolean highQuality;
        private String alg;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCopywriter() {
            return copywriter;
        }

        public void setCopywriter(String copywriter) {
            this.copywriter = copywriter;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public boolean isCanDislike() {
            return canDislike;
        }

        public void setCanDislike(boolean canDislike) {
            this.canDislike = canDislike;
        }

        public long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "id=" + id +
                    ", type=" + type +
                    ", name='" + name + '\'' +
                    ", copywriter='" + copywriter + '\'' +
                    ", picUrl='" + picUrl + '\'' +
                    ", canDislike=" + canDislike +
                    ", trackNumberUpdateTime=" + trackNumberUpdateTime +
                    ", playCount=" + playCount +
                    ", trackCount=" + trackCount +
                    ", highQuality=" + highQuality +
                    ", alg='" + alg + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "RecommendSongs{" +
                "hasTaste=" + hasTaste +
                ", category=" + category +
                ", result=" + result +
                '}';
    }
}
