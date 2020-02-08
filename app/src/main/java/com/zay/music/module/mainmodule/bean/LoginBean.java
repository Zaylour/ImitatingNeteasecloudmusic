package com.zay.music.module.mainmodule.bean;

import com.zay.music.data.BaseResponse;

import java.util.List;

public class LoginBean extends BaseResponse {


    /**
     * loginType : 1
     * account : {"id":320824761,"userName":"1_15011985351","type":1,"status":0,"whitelistAuthority":0,"createTime":1471529439809,"salt":"[B@188e545f","tokenVersion":0,"ban":0,"baoyueVersion":1,"donateVersion":0,"vipType":0,"viptypeVersion":1565712963355,"anonimousUser":false}
     * token : 8907d9c36a20e0a0f29f5057a869acadfe04e433f1221ca9937c2bd2594086723fdc9c07c9c9c39692303a2cf13cf3147955a739ab43dce1
     * profile : {"avatarImgIdStr":"109951162867466556","backgroundImgIdStr":"109951162867464266","djStatus":0,"mutual":false,"remarkName":null,"expertTags":null,"authStatus":0,"experts":{},"userId":320824761,"vipType":0,"gender":1,"avatarImgId":109951162867466560,"accountStatus":0,"nickname":"Zaylour","birthday":770745600000,"city":440100,"backgroundImgId":109951162867464270,"userType":0,"province":440000,"defaultAvatar":false,"avatarUrl":"https://p3.music.126.net/d0wSYujEkZpbhfG9u4godA==/109951162867466556.jpg","description":"","detailDescription":"","followed":false,"backgroundUrl":"https://p3.music.126.net/4UtwrAOQm2l0KLALP0WZdA==/109951162867464266.jpg","signature":"","authority":0,"avatarImgId_str":"109951162867466556","followeds":4,"follows":33,"eventCount":3,"playlistCount":7,"playlistBeSubscribedCount":0}
     * bindings : [{"expiresIn":2147483647,"bindingTime":1471529439809,"url":"","expired":false,"userId":320824761,"tokenJsonStr":"{\"countrycode\":\"\",\"cellphone\":\"15011985351\",\"hasPassword\":true}","refreshTime":1471529439,"id":2889779160,"type":1},{"expiresIn":7776000,"bindingTime":1490429816716,"url":"","expired":true,"userId":320824761,"tokenJsonStr":"{\"access_token\":\"E06176B6E615CD8F645F0DF4D2783FF9\",\"refresh_token\":\"7C8483C7E5665B32A82DA5F149E4CA74\",\"openid\":\"764B4E4DA2CC6A5777A9447D42BA815F\",\"nickname\":\"Zyzyzy\",\"expires_in\":7776000}","refreshTime":1490429816,"id":2997242572,"type":5}]
     */

    private int loginType;
    private AccountBean account;
    private String token;
    private ProfileBean profile;
    private List<BindingsBean> bindings;

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public List<BindingsBean> getBindings() {
        return bindings;
    }

    public void setBindings(List<BindingsBean> bindings) {
        this.bindings = bindings;
    }

    public static class AccountBean {
        /**
         * id : 320824761
         * userName : 1_15011985351
         * type : 1
         * status : 0
         * whitelistAuthority : 0
         * createTime : 1471529439809
         * salt : [B@188e545f
         * tokenVersion : 0
         * ban : 0
         * baoyueVersion : 1
         * donateVersion : 0
         * vipType : 0
         * viptypeVersion : 1565712963355
         * anonimousUser : false
         */

        private int id;
        private String userName;
        private int type;
        private int status;
        private int whitelistAuthority;
        private long createTime;
        private String salt;
        private int tokenVersion;
        private int ban;
        private int baoyueVersion;
        private int donateVersion;
        private int vipType;
        private long viptypeVersion;
        private boolean anonimousUser;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getWhitelistAuthority() {
            return whitelistAuthority;
        }

        public void setWhitelistAuthority(int whitelistAuthority) {
            this.whitelistAuthority = whitelistAuthority;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public int getTokenVersion() {
            return tokenVersion;
        }

        public void setTokenVersion(int tokenVersion) {
            this.tokenVersion = tokenVersion;
        }

        public int getBan() {
            return ban;
        }

        public void setBan(int ban) {
            this.ban = ban;
        }

        public int getBaoyueVersion() {
            return baoyueVersion;
        }

        public void setBaoyueVersion(int baoyueVersion) {
            this.baoyueVersion = baoyueVersion;
        }

        public int getDonateVersion() {
            return donateVersion;
        }

        public void setDonateVersion(int donateVersion) {
            this.donateVersion = donateVersion;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public long getViptypeVersion() {
            return viptypeVersion;
        }

        public void setViptypeVersion(long viptypeVersion) {
            this.viptypeVersion = viptypeVersion;
        }

        public boolean isAnonimousUser() {
            return anonimousUser;
        }

        public void setAnonimousUser(boolean anonimousUser) {
            this.anonimousUser = anonimousUser;
        }
    }

    public static class ProfileBean {
        /**
         * avatarImgIdStr : 109951162867466556
         * backgroundImgIdStr : 109951162867464266
         * djStatus : 0
         * mutual : false
         * remarkName : null
         * expertTags : null
         * authStatus : 0
         * experts : {}
         * userId : 320824761
         * vipType : 0
         * gender : 1
         * avatarImgId : 109951162867466560
         * accountStatus : 0
         * nickname : Zaylour
         * birthday : 770745600000
         * city : 440100
         * backgroundImgId : 109951162867464270
         * userType : 0
         * province : 440000
         * defaultAvatar : false
         * avatarUrl : https://p3.music.126.net/d0wSYujEkZpbhfG9u4godA==/109951162867466556.jpg
         * description :
         * detailDescription :
         * followed : false
         * backgroundUrl : https://p3.music.126.net/4UtwrAOQm2l0KLALP0WZdA==/109951162867464266.jpg
         * signature :
         * authority : 0
         * avatarImgId_str : 109951162867466556
         * followeds : 4
         * follows : 33
         * eventCount : 3
         * playlistCount : 7
         * playlistBeSubscribedCount : 0
         */

        private String avatarImgIdStr;
        private String backgroundImgIdStr;
        private int djStatus;
        private boolean mutual;
        private Object remarkName;
        private Object expertTags;
        private int authStatus;
        private ExpertsBean experts;
        private int userId;
        private int vipType;
        private int gender;
        private long avatarImgId;
        private int accountStatus;
        private String nickname;
        private long birthday;
        private int city;
        private long backgroundImgId;
        private int userType;
        private int province;
        private boolean defaultAvatar;
        private String avatarUrl;
        private String description;
        private String detailDescription;
        private boolean followed;
        private String backgroundUrl;
        private String signature;
        private int authority;
        private String avatarImgId_str;
        private int followeds;
        private int follows;
        private int eventCount;
        private int playlistCount;
        private int playlistBeSubscribedCount;

        public String getAvatarImgIdStr() {
            return avatarImgIdStr;
        }

        public void setAvatarImgIdStr(String avatarImgIdStr) {
            this.avatarImgIdStr = avatarImgIdStr;
        }

        public String getBackgroundImgIdStr() {
            return backgroundImgIdStr;
        }

        public void setBackgroundImgIdStr(String backgroundImgIdStr) {
            this.backgroundImgIdStr = backgroundImgIdStr;
        }

        public int getDjStatus() {
            return djStatus;
        }

        public void setDjStatus(int djStatus) {
            this.djStatus = djStatus;
        }

        public boolean isMutual() {
            return mutual;
        }

        public void setMutual(boolean mutual) {
            this.mutual = mutual;
        }

        public Object getRemarkName() {
            return remarkName;
        }

        public void setRemarkName(Object remarkName) {
            this.remarkName = remarkName;
        }

        public Object getExpertTags() {
            return expertTags;
        }

        public void setExpertTags(Object expertTags) {
            this.expertTags = expertTags;
        }

        public int getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(int authStatus) {
            this.authStatus = authStatus;
        }

        public ExpertsBean getExperts() {
            return experts;
        }

        public void setExperts(ExpertsBean experts) {
            this.experts = experts;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public long getAvatarImgId() {
            return avatarImgId;
        }

        public void setAvatarImgId(long avatarImgId) {
            this.avatarImgId = avatarImgId;
        }

        public int getAccountStatus() {
            return accountStatus;
        }

        public void setAccountStatus(int accountStatus) {
            this.accountStatus = accountStatus;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public long getBackgroundImgId() {
            return backgroundImgId;
        }

        public void setBackgroundImgId(long backgroundImgId) {
            this.backgroundImgId = backgroundImgId;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public boolean isDefaultAvatar() {
            return defaultAvatar;
        }

        public void setDefaultAvatar(boolean defaultAvatar) {
            this.defaultAvatar = defaultAvatar;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
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

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public String getBackgroundUrl() {
            return backgroundUrl;
        }

        public void setBackgroundUrl(String backgroundUrl) {
            this.backgroundUrl = backgroundUrl;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getAuthority() {
            return authority;
        }

        public void setAuthority(int authority) {
            this.authority = authority;
        }

        public String getAvatarImgId_str() {
            return avatarImgId_str;
        }

        public void setAvatarImgId_str(String avatarImgId_str) {
            this.avatarImgId_str = avatarImgId_str;
        }

        public int getFolloweds() {
            return followeds;
        }

        public void setFolloweds(int followeds) {
            this.followeds = followeds;
        }

        public int getFollows() {
            return follows;
        }

        public void setFollows(int follows) {
            this.follows = follows;
        }

        public int getEventCount() {
            return eventCount;
        }

        public void setEventCount(int eventCount) {
            this.eventCount = eventCount;
        }

        public int getPlaylistCount() {
            return playlistCount;
        }

        public void setPlaylistCount(int playlistCount) {
            this.playlistCount = playlistCount;
        }

        public int getPlaylistBeSubscribedCount() {
            return playlistBeSubscribedCount;
        }

        public void setPlaylistBeSubscribedCount(int playlistBeSubscribedCount) {
            this.playlistBeSubscribedCount = playlistBeSubscribedCount;
        }

        public static class ExpertsBean {
        }
    }

    public static class BindingsBean {
        /**
         * expiresIn : 2147483647
         * bindingTime : 1471529439809
         * url :
         * expired : false
         * userId : 320824761
         * tokenJsonStr : {"countrycode":"","cellphone":"15011985351","hasPassword":true}
         * refreshTime : 1471529439
         * id : 2889779160
         * type : 1
         */

        private int expiresIn;
        private long bindingTime;
        private String url;
        private boolean expired;
        private int userId;
        private String tokenJsonStr;
        private int refreshTime;
        private long id;
        private int type;

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public long getBindingTime() {
            return bindingTime;
        }

        public void setBindingTime(long bindingTime) {
            this.bindingTime = bindingTime;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getTokenJsonStr() {
            return tokenJsonStr;
        }

        public void setTokenJsonStr(String tokenJsonStr) {
            this.tokenJsonStr = tokenJsonStr;
        }

        public int getRefreshTime() {
            return refreshTime;
        }

        public void setRefreshTime(int refreshTime) {
            this.refreshTime = refreshTime;
        }

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
    }
}
