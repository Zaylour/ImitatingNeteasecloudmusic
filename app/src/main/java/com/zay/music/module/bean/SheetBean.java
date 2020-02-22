package com.zay.music.module.bean;

import com.google.gson.annotations.SerializedName;
import com.zay.music.data.BaseResponse;

import java.util.List;

public class SheetBean extends BaseResponse {
    /**
     * playlists : [{"name":"等我们老了，也要手牵着手一起去看海","id":3238077449,"trackNumberUpdateTime":1582102786898,"status":0,"userId":129593031,"createTime":1581327028509,"updateTime":1582284045979,"subscribedCount":2688,"trackCount":74,"cloudTrackCount":0,"coverImgUrl":"http://p2.music.126.net/wmG5kljvNcOWTXnzMsT8IA==/109951164729607047.jpg","coverImgId":109951164729607040,"description":"想要抓住每一个幸福的瞬间\n想要抵达每一个明朗的彼岸\n珍惜和善待 平和与宽宥 在日升月落间\n看见美好 照见温暖 让爱绵长\n愿你能遇见一个人 能从Ta深情的双眼里看到未来\n平凡而不平庸地浪漫老去 手牵着手一起去看海","tags":["华语","流行","浪漫"],"playCount":592967,"trackUpdateTime":1582257078055,"specialType":0,"totalDuration":0,"creator":{"defaultAvatar":false,"province":1000000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/IA3sHPLBQX9VcnwartzmXg==/109951163601494465.jpg","accountStatus":0,"gender":2,"city":1007400,"birthday":843846878000,"userId":129593031,"userType":200,"nickname":"mayuko然","signature":"Be patient. The best things happen unexpectedly.","description":"","detailDescription":"","avatarImgId":109951163601494460,"backgroundImgId":109951164489991380,"backgroundUrl":"http://p1.music.126.net/B99ayEAoz3ccytcICq6iXQ==/109951164489991375.jpg","authority":0,"mutual":false,"expertTags":["华语","流行","欧美"],"experts":{"1":"音乐视频达人","2":"情感图文达人"},"djStatus":10,"vipType":11,"remarkName":null,"backgroundImgIdStr":"109951164489991375","avatarImgIdStr":"109951163601494465","avatarImgId_str":"109951163601494465"},"tracks":null,"subscribers":[{"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/88cpKbJPUO75aGy5qy121Q==/109951164718978621.jpg","accountStatus":0,"gender":1,"city":110101,"birthday":-2209017600000,"userId":477890695,"userType":0,"nickname":"心之所往_wh","signature":"我于明早重生，来时心怀暖阳","description":"","detailDescription":"","avatarImgId":109951164718978620,"backgroundImgId":109951164083024030,"backgroundUrl":"http://p1.music.126.net/K8lra6VXlnP7Wej1sCc3aA==/109951164083024025.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"backgroundImgIdStr":"109951164083024025","avatarImgIdStr":"109951164718978621","avatarImgId_str":"109951164718978621"}],"subscribed":false,"commentThreadId":"A_PL_0_3238077449","newImported":false,"adType":0,"highQuality":false,"privacy":0,"ordered":true,"anonimous":false,"coverStatus":3,"recommendInfo":null,"shareCount":20,"coverImgId_str":"109951164729607047","commentCount":26,"alg":"alg_sq_featured"}]
     * total : 1304
     * code : 200
     * more : true
     * cat : 全部
     */

    private int total;
    private boolean more;
    private String cat;
    private List<PlaylistsBean> playlists;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public List<PlaylistsBean> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistsBean> playlists) {
        this.playlists = playlists;
    }

    public static class PlaylistsBean {
        /**
         * name : 等我们老了，也要手牵着手一起去看海
         * id : 3238077449
         * trackNumberUpdateTime : 1582102786898
         * status : 0
         * userId : 129593031
         * createTime : 1581327028509
         * updateTime : 1582284045979
         * subscribedCount : 2688
         * trackCount : 74
         * cloudTrackCount : 0
         * coverImgUrl : http://p2.music.126.net/wmG5kljvNcOWTXnzMsT8IA==/109951164729607047.jpg
         * coverImgId : 109951164729607040
         * description : 想要抓住每一个幸福的瞬间
         想要抵达每一个明朗的彼岸
         珍惜和善待 平和与宽宥 在日升月落间
         看见美好 照见温暖 让爱绵长
         愿你能遇见一个人 能从Ta深情的双眼里看到未来
         平凡而不平庸地浪漫老去 手牵着手一起去看海
         * tags : ["华语","流行","浪漫"]
         * playCount : 592967
         * trackUpdateTime : 1582257078055
         * specialType : 0
         * totalDuration : 0
         * creator : {"defaultAvatar":false,"province":1000000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/IA3sHPLBQX9VcnwartzmXg==/109951163601494465.jpg","accountStatus":0,"gender":2,"city":1007400,"birthday":843846878000,"userId":129593031,"userType":200,"nickname":"mayuko然","signature":"Be patient. The best things happen unexpectedly.","description":"","detailDescription":"","avatarImgId":109951163601494460,"backgroundImgId":109951164489991380,"backgroundUrl":"http://p1.music.126.net/B99ayEAoz3ccytcICq6iXQ==/109951164489991375.jpg","authority":0,"mutual":false,"expertTags":["华语","流行","欧美"],"experts":{"1":"音乐视频达人","2":"情感图文达人"},"djStatus":10,"vipType":11,"remarkName":null,"backgroundImgIdStr":"109951164489991375","avatarImgIdStr":"109951163601494465","avatarImgId_str":"109951163601494465"}
         * tracks : null
         * subscribers : [{"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/88cpKbJPUO75aGy5qy121Q==/109951164718978621.jpg","accountStatus":0,"gender":1,"city":110101,"birthday":-2209017600000,"userId":477890695,"userType":0,"nickname":"心之所往_wh","signature":"我于明早重生，来时心怀暖阳","description":"","detailDescription":"","avatarImgId":109951164718978620,"backgroundImgId":109951164083024030,"backgroundUrl":"http://p1.music.126.net/K8lra6VXlnP7Wej1sCc3aA==/109951164083024025.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"backgroundImgIdStr":"109951164083024025","avatarImgIdStr":"109951164718978621","avatarImgId_str":"109951164718978621"}]
         * subscribed : false
         * commentThreadId : A_PL_0_3238077449
         * newImported : false
         * adType : 0
         * highQuality : false
         * privacy : 0
         * ordered : true
         * anonimous : false
         * coverStatus : 3
         * recommendInfo : null
         * shareCount : 20
         * coverImgId_str : 109951164729607047
         * commentCount : 26
         * alg : alg_sq_featured
         */

        private String name;
        private String id;
        private String trackNumberUpdateTime;
        private String status;
        private String userId;
        private String createTime;
        private String updateTime;
        private String subscribedCount;
        private String trackCount;
        private String cloudTrackCount;
        private String coverImgUrl;
        private String coverImgId;
        private String description;
        private String playCount;
        private String trackUpdateTime;
        private String specialType;
        private String totalDuration;
        private CreatorBean creator;
        private Object tracks;
        private boolean subscribed;
        private String commentThreadId;
        private boolean newImported;
        private String adType;
        private boolean highQuality;
        private String privacy;
        private boolean ordered;
        private boolean anonimous;
        private String coverStatus;
        private Object recommendInfo;
        private String shareCount;
        private String coverImgId_str;
        private String commentCount;
        private String alg;
        private List<String> tags;
        private List<SubscribersBean> subscribers;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(String trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(String subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public String getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(String trackCount) {
            this.trackCount = trackCount;
        }

        public String getCloudTrackCount() {
            return cloudTrackCount;
        }

        public void setCloudTrackCount(String cloudTrackCount) {
            this.cloudTrackCount = cloudTrackCount;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public String getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(String coverImgId) {
            this.coverImgId = coverImgId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPlayCount() {
            return playCount;
        }

        public void setPlayCount(String playCount) {
            this.playCount = playCount;
        }

        public String getTrackUpdateTime() {
            return trackUpdateTime;
        }

        public void setTrackUpdateTime(String trackUpdateTime) {
            this.trackUpdateTime = trackUpdateTime;
        }

        public String getSpecialType() {
            return specialType;
        }

        public void setSpecialType(String specialType) {
            this.specialType = specialType;
        }

        public String getTotalDuration() {
            return totalDuration;
        }

        public void setTotalDuration(String totalDuration) {
            this.totalDuration = totalDuration;
        }

        public void setAdType(String adType) {
            this.adType = adType;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public void setCoverStatus(String coverStatus) {
            this.coverStatus = coverStatus;
        }

        public void setShareCount(String shareCount) {
            this.shareCount = shareCount;
        }

        public void setCommentCount(String commentCount) {
            this.commentCount = commentCount;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public Object getTracks() {
            return tracks;
        }

        public void setTracks(Object tracks) {
            this.tracks = tracks;
        }

        public boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public boolean isNewImported() {
            return newImported;
        }

        public void setNewImported(boolean newImported) {
            this.newImported = newImported;
        }



        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }



        public boolean isOrdered() {
            return ordered;
        }

        public void setOrdered(boolean ordered) {
            this.ordered = ordered;
        }

        public boolean isAnonimous() {
            return anonimous;
        }

        public void setAnonimous(boolean anonimous) {
            this.anonimous = anonimous;
        }



        public Object getRecommendInfo() {
            return recommendInfo;
        }

        public void setRecommendInfo(Object recommendInfo) {
            this.recommendInfo = recommendInfo;
        }



        public String getCoverImgId_str() {
            return coverImgId_str;
        }

        public void setCoverImgId_str(String coverImgId_str) {
            this.coverImgId_str = coverImgId_str;
        }


        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public List<SubscribersBean> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<SubscribersBean> subscribers) {
            this.subscribers = subscribers;
        }

        public String getAdType() {
            return adType;
        }

        public String getPrivacy() {
            return privacy;
        }

        public String getCoverStatus() {
            return coverStatus;
        }

        public String getShareCount() {
            return shareCount;
        }

        public String getCommentCount() {
            return commentCount;
        }

        public static class CreatorBean {
            /**
             * defaultAvatar : false
             * province : 1000000
             * authStatus : 0
             * followed : false
             * avatarUrl : http://p1.music.126.net/IA3sHPLBQX9VcnwartzmXg==/109951163601494465.jpg
             * accountStatus : 0
             * gender : 2
             * city : 1007400
             * birthday : 843846878000
             * userId : 129593031
             * userType : 200
             * nickname : mayuko然
             * signature : Be patient. The best things happen unexpectedly.
             * description :
             * detailDescription :
             * avatarImgId : 109951163601494460
             * backgroundImgId : 109951164489991380
             * backgroundUrl : http://p1.music.126.net/B99ayEAoz3ccytcICq6iXQ==/109951164489991375.jpg
             * authority : 0
             * mutual : false
             * expertTags : ["华语","流行","欧美"]
             * experts : {"1":"音乐视频达人","2":"情感图文达人"}
             * djStatus : 10
             * vipType : 11
             * remarkName : null
             * backgroundImgIdStr : 109951164489991375
             * avatarImgIdStr : 109951163601494465
             * avatarImgId_str : 109951163601494465
             */

            private boolean defaultAvatar;
            private String province;
            private String authStatus;
            private boolean followed;
            private String avatarUrl;
            private String accountStatus;
            private String gender;
            private String city;
            private String birthday;
            private String userId;
            private String userType;
            private String nickname;
            private String signature;
            private String description;
            private String detailDescription;
            private String avatarImgId;
            private String backgroundImgId;
            private String backgroundUrl;
            private String authority;
            private boolean mutual;
            private ExpertsBean experts;
            private String djStatus;
            private String vipType;
            private Object remarkName;
            private String backgroundImgIdStr;
            private String avatarImgIdStr;
            private String avatarImgId_str;
            private List<String> expertTags;

            public boolean isDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }



            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }


            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(String authStatus) {
                this.authStatus = authStatus;
            }

            public String getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getUserType() {
                return userType;
            }

            public void setUserType(String userType) {
                this.userType = userType;
            }

            public void setAvatarImgId(String avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public void setBackgroundImgId(String backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public void setAuthority(String authority) {
                this.authority = authority;
            }

            public void setDjStatus(String djStatus) {
                this.djStatus = djStatus;
            }

            public void setVipType(String vipType) {
                this.vipType = vipType;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
            }



            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }



            public boolean isMutual() {
                return mutual;
            }

            public void setMutual(boolean mutual) {
                this.mutual = mutual;
            }

            public ExpertsBean getExperts() {
                return experts;
            }

            public void setExperts(ExpertsBean experts) {
                this.experts = experts;
            }



            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
            }

            public String getBackgroundImgIdStr() {
                return backgroundImgIdStr;
            }

            public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                this.backgroundImgIdStr = backgroundImgIdStr;
            }

            public String getAvatarImgIdStr() {
                return avatarImgIdStr;
            }

            public void setAvatarImgIdStr(String avatarImgIdStr) {
                this.avatarImgIdStr = avatarImgIdStr;
            }

            public String getAvatarImgId_str() {
                return avatarImgId_str;
            }

            public void setAvatarImgId_str(String avatarImgId_str) {
                this.avatarImgId_str = avatarImgId_str;
            }

            public List<String> getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(List<String> expertTags) {
                this.expertTags = expertTags;
            }


            public String getAvatarImgId() {
                return avatarImgId;
            }

            public String getBackgroundImgId() {
                return backgroundImgId;
            }

            public String getAuthority() {
                return authority;
            }

            public String getDjStatus() {
                return djStatus;
            }

            public String getVipType() {
                return vipType;
            }

            public static class ExpertsBean {
                /**
                 * 1 : 音乐视频达人
                 * 2 : 情感图文达人
                 */

                @SerializedName("1")
                private String _$1;
                @SerializedName("2")
                private String _$2;

                public String get_$1() {
                    return _$1;
                }

                public void set_$1(String _$1) {
                    this._$1 = _$1;
                }

                public String get_$2() {
                    return _$2;
                }

                public void set_$2(String _$2) {
                    this._$2 = _$2;
                }
            }
        }

        public static class SubscribersBean {
            /**
             * defaultAvatar : false
             * province : 110000
             * authStatus : 0
             * followed : false
             * avatarUrl : http://p1.music.126.net/88cpKbJPUO75aGy5qy121Q==/109951164718978621.jpg
             * accountStatus : 0
             * gender : 1
             * city : 110101
             * birthday : -2209017600000
             * userId : 477890695
             * userType : 0
             * nickname : 心之所往_wh
             * signature : 我于明早重生，来时心怀暖阳
             * description :
             * detailDescription :
             * avatarImgId : 109951164718978620
             * backgroundImgId : 109951164083024030
             * backgroundUrl : http://p1.music.126.net/K8lra6VXlnP7Wej1sCc3aA==/109951164083024025.jpg
             * authority : 0
             * mutual : false
             * expertTags : null
             * experts : null
             * djStatus : 0
             * vipType : 0
             * remarkName : null
             * backgroundImgIdStr : 109951164083024025
             * avatarImgIdStr : 109951164718978621
             * avatarImgId_str : 109951164718978621
             */

            private boolean defaultAvatar;
            private String province;
            private String authStatus;
            private boolean followed;
            private String avatarUrl;
            private String accountStatus;
            private String gender;
            private String city;
            private String birthday;
            private String userId;
            private String userType;
            private String nickname;
            private String signature;
            private String description;
            private String detailDescription;
            private String avatarImgId;
            private String backgroundImgId;
            private String backgroundUrl;
            private String authority;
            private boolean mutual;
            private Object expertTags;
            private Object experts;
            private String djStatus;
            private String vipType;
            private Object remarkName;
            private String backgroundImgIdStr;
            private String avatarImgIdStr;
            private String avatarImgId_str;

            public boolean isDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }



            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }





            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
            }



            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }



            public boolean isMutual() {
                return mutual;
            }

            public void setMutual(boolean mutual) {
                this.mutual = mutual;
            }

            public Object getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(Object expertTags) {
                this.expertTags = expertTags;
            }

            public Object getExperts() {
                return experts;
            }

            public void setExperts(Object experts) {
                this.experts = experts;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(String authStatus) {
                this.authStatus = authStatus;
            }

            public String getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getUserType() {
                return userType;
            }

            public void setUserType(String userType) {
                this.userType = userType;
            }

            public String getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(String avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public String getBackgroundImgId() {
                return backgroundImgId;
            }

            public void setBackgroundImgId(String backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public String getAuthority() {
                return authority;
            }

            public void setAuthority(String authority) {
                this.authority = authority;
            }

            public String getDjStatus() {
                return djStatus;
            }

            public void setDjStatus(String djStatus) {
                this.djStatus = djStatus;
            }

            public String getVipType() {
                return vipType;
            }

            public void setVipType(String vipType) {
                this.vipType = vipType;
            }

            public Object getRemarkName() {
                return remarkName;
            }

            public void setRemarkName(Object remarkName) {
                this.remarkName = remarkName;
            }

            public String getBackgroundImgIdStr() {
                return backgroundImgIdStr;
            }

            public void setBackgroundImgIdStr(String backgroundImgIdStr) {
                this.backgroundImgIdStr = backgroundImgIdStr;
            }

            public String getAvatarImgIdStr() {
                return avatarImgIdStr;
            }

            public void setAvatarImgIdStr(String avatarImgIdStr) {
                this.avatarImgIdStr = avatarImgIdStr;
            }

            public String getAvatarImgId_str() {
                return avatarImgId_str;
            }

            public void setAvatarImgId_str(String avatarImgId_str) {
                this.avatarImgId_str = avatarImgId_str;
            }
        }
    }
}
