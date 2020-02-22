package com.zay.music.module.bean;

import com.zay.music.data.BaseResponse;

import java.util.List;


public class MyPlaylist extends  BaseResponse {

    private boolean more;
    private List<PlaylistBean> playlist;


    public void setMore(boolean more) {
        this.more = more;
    }
    public boolean getMore() {
        return more;
    }


    public void setPlaylist(List<PlaylistBean> playlist) {
        this.playlist = playlist;
    }
    public List<PlaylistBean> getPlaylist() {
        return playlist;
    }


    public class PlaylistBean {

        private List<String> subscribers;
        private boolean subscribed;
        private String artists;
        private String tracks;
        private String updatefrequency;
        private int backgroundcoverid;
        private String backgroundcoverurl;
        private int titleimage;
        private String titleimageurl;
        private String englishtitle;
        private boolean oprecommend;
        private String recommendinfo;
        private boolean ordered;
        private int status;
        private List<String> tags;
        private String userId;
        private int adtype;
        private int tracknumberupdatetime;
        private int updatetime;
        private int coverimgid;
        private boolean newimported;
        private boolean anonimous;
        private int subscribedcount;
        private int cloudtrackcount;
        private String description;
        private boolean highquality;
        private String coverImgUrl;
        private String commentthreadid;
        private String specialtype;
        private String privacy;
        private String trackCount;
        private String playcount;
        private String name;
        private String id;

        @Override
        public String toString() {
            return "PlaylistBean{" +
                    "subscribers=" + subscribers +
                    ", subscribed=" + subscribed +
                    ", artists='" + artists + '\'' +
                    ", tracks='" + tracks + '\'' +
                    ", updatefrequency='" + updatefrequency + '\'' +
                    ", backgroundcoverid=" + backgroundcoverid +
                    ", backgroundcoverurl='" + backgroundcoverurl + '\'' +
                    ", titleimage=" + titleimage +
                    ", titleimageurl='" + titleimageurl + '\'' +
                    ", englishtitle='" + englishtitle + '\'' +
                    ", oprecommend=" + oprecommend +
                    ", recommendinfo='" + recommendinfo + '\'' +
                    ", ordered=" + ordered +
                    ", status=" + status +
                    ", tags=" + tags +
                    ", userid=" + userId +
                    ", adtype=" + adtype +
                    ", tracknumberupdatetime=" + tracknumberupdatetime +
                    ", updatetime=" + updatetime +
                    ", coverimgid=" + coverimgid +
                    ", newimported=" + newimported +
                    ", anonimous=" + anonimous +
                    ", subscribedcount=" + subscribedcount +
                    ", cloudtrackcount=" + cloudtrackcount +
                    ", description='" + description + '\'' +
                    ", highquality=" + highquality +
                    ", coverimgurl='" + coverImgUrl + '\'' +
                    ", commentthreadid='" + commentthreadid + '\'' +
                    ", specialtype='" + specialtype + '\'' +
                    ", privacy='" + privacy + '\'' +
                    ", trackcount='" + trackCount + '\'' +
                    ", playcount='" + playcount + '\'' +
                    ", name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", coverimgidStr='" + coverimgidStr + '\'' +
                    '}';
        }

        private String coverimgidStr;

        public boolean isSubscribed() {
            return subscribed;
        }

        public boolean isOprecommend() {
            return oprecommend;
        }

        public boolean isOrdered() {
            return ordered;
        }

        public boolean isNewimported() {
            return newimported;
        }

        public boolean isAnonimous() {
            return anonimous;
        }

        public boolean isHighquality() {
            return highquality;
        }

        public String getSpecialtype() {
            return specialtype;
        }

        public void setSpecialtype(String specialtype) {
            this.specialtype = specialtype;
        }

        public String getPrivacy() {
            return privacy;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public String getTrackcount() {
            return trackCount;
        }

        public void setTrackcount(String trackcount) {
            this.trackCount = trackcount;
        }

        public String getPlaycount() {
            return playcount;
        }

        public void setPlaycount(String playcount) {
            this.playcount = playcount;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSubscribers(List<String> subscribers) {
            this.subscribers = subscribers;
        }
        public List<String> getSubscribers() {
            return subscribers;
        }


        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }
        public boolean getSubscribed() {
            return subscribed;
        }




        public void setArtists(String artists) {
            this.artists = artists;
        }
        public String getArtists() {
            return artists;
        }


        public void setTracks(String tracks) {
            this.tracks = tracks;
        }
        public String getTracks() {
            return tracks;
        }


        public void setUpdatefrequency(String updatefrequency) {
            this.updatefrequency = updatefrequency;
        }
        public String getUpdatefrequency() {
            return updatefrequency;
        }


        public void setBackgroundcoverid(int backgroundcoverid) {
            this.backgroundcoverid = backgroundcoverid;
        }
        public int getBackgroundcoverid() {
            return backgroundcoverid;
        }


        public void setBackgroundcoverurl(String backgroundcoverurl) {
            this.backgroundcoverurl = backgroundcoverurl;
        }
        public String getBackgroundcoverurl() {
            return backgroundcoverurl;
        }


        public void setTitleimage(int titleimage) {
            this.titleimage = titleimage;
        }
        public int getTitleimage() {
            return titleimage;
        }


        public void setTitleimageurl(String titleimageurl) {
            this.titleimageurl = titleimageurl;
        }
        public String getTitleimageurl() {
            return titleimageurl;
        }


        public void setEnglishtitle(String englishtitle) {
            this.englishtitle = englishtitle;
        }
        public String getEnglishtitle() {
            return englishtitle;
        }


        public void setOprecommend(boolean oprecommend) {
            this.oprecommend = oprecommend;
        }
        public boolean getOprecommend() {
            return oprecommend;
        }


        public void setRecommendinfo(String recommendinfo) {
            this.recommendinfo = recommendinfo;
        }
        public String getRecommendinfo() {
            return recommendinfo;
        }


        public void setOrdered(boolean ordered) {
            this.ordered = ordered;
        }
        public boolean getOrdered() {
            return ordered;
        }


        public void setStatus(int status) {
            this.status = status;
        }
        public int getStatus() {
            return status;
        }


        public void setTags(List<String> tags) {
            this.tags = tags;
        }
        public List<String> getTags() {
            return tags;
        }


        public void setUserid(String userid) {
            this.userId = userid;
        }
        public String getUserid() {
            return userId;
        }


        public void setAdtype(int adtype) {
            this.adtype = adtype;
        }
        public int getAdtype() {
            return adtype;
        }


        public void setTracknumberupdatetime(int tracknumberupdatetime) {
            this.tracknumberupdatetime = tracknumberupdatetime;
        }
        public int getTracknumberupdatetime() {
            return tracknumberupdatetime;
        }


        public void setUpdatetime(int updatetime) {
            this.updatetime = updatetime;
        }
        public int getUpdatetime() {
            return updatetime;
        }


        public void setCoverimgid(int coverimgid) {
            this.coverimgid = coverimgid;
        }
        public int getCoverimgid() {
            return coverimgid;
        }


        public void setNewimported(boolean newimported) {
            this.newimported = newimported;
        }
        public boolean getNewimported() {
            return newimported;
        }


        public void setAnonimous(boolean anonimous) {
            this.anonimous = anonimous;
        }
        public boolean getAnonimous() {
            return anonimous;
        }


        public void setSubscribedcount(int subscribedcount) {
            this.subscribedcount = subscribedcount;
        }
        public int getSubscribedcount() {
            return subscribedcount;
        }


        public void setCloudtrackcount(int cloudtrackcount) {
            this.cloudtrackcount = cloudtrackcount;
        }
        public int getCloudtrackcount() {
            return cloudtrackcount;
        }


        public void setDescription(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }




        public void setHighquality(boolean highquality) {
            this.highquality = highquality;
        }
        public boolean getHighquality() {
            return highquality;
        }


        public void setCoverimgurl(String coverimgurl) {
            this.coverImgUrl = coverimgurl;
        }
        public String getCoverimgurl() {
            return coverImgUrl;
        }


        public void setCommentthreadid(String commentthreadid) {
            this.commentthreadid = commentthreadid;
        }
        public String getCommentthreadid() {
            return commentthreadid;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }


        public void setCoverimgidStr(String coverimgidStr) {
            this.coverimgidStr = coverimgidStr;
        }
        public String getCoverimgidStr() {
            return coverimgidStr;
        }




    }

    @Override
    public String toString() {
        return "MyPlaylist{" +
                "more=" + more +
                ", playlist=" + playlist +
                '}';
    }
}



