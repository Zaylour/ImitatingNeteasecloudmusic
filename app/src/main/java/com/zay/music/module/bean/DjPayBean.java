package com.zay.music.module.bean;

import com.zay.music.data.BaseResponse;

import java.util.List;

public class DjPayBean extends BaseResponse {

    /**
     * code : 200
     * msg : null
     * data : {"total":1,"updateTime":1581172549032,"list":[{"id":792051371,"rank":1,"lastRank":1,"score":169240,"name":"樊登读书·人生必备锦囊","picUrl":"https://p2.music.126.net/kNExTa_vKUamTOcltuxwxQ==/109951163639157220.jpg","creatorName":"樊登读书电台"}]}
     */

    private Object msg;
    private DataBean data;

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * total : 1
         * updateTime : 1581172549032
         * list : [{"id":792051371,"rank":1,"lastRank":1,"score":169240,"name":"樊登读书·人生必备锦囊","picUrl":"https://p2.music.126.net/kNExTa_vKUamTOcltuxwxQ==/109951163639157220.jpg","creatorName":"樊登读书电台"}]
         */

        private int total;
        private long updateTime;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 792051371
             * rank : 1
             * lastRank : 1
             * score : 169240
             * name : 樊登读书·人生必备锦囊
             * picUrl : https://p2.music.126.net/kNExTa_vKUamTOcltuxwxQ==/109951163639157220.jpg
             * creatorName : 樊登读书电台
             */

            private int id;
            private int rank;
            private int lastRank;
            private int score;
            private String name;
            private String picUrl;
            private String creatorName;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public int getLastRank() {
                return lastRank;
            }

            public void setLastRank(int lastRank) {
                this.lastRank = lastRank;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getCreatorName() {
                return creatorName;
            }

            public void setCreatorName(String creatorName) {
                this.creatorName = creatorName;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "id=" + id +
                        ", rank=" + rank +
                        ", lastRank=" + lastRank +
                        ", score=" + score +
                        ", name='" + name + '\'' +
                        ", picUrl='" + picUrl + '\'' +
                        ", creatorName='" + creatorName + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "total=" + total +
                    ", updateTime=" + updateTime +
                    ", list=" + list +
                    '}';
        }
    }
}
