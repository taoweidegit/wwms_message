package com.wmms.mutils.entity;

import java.util.Date;

public class TLogin {
    private Long ID;

    /**
     * 用户id
     */
    private Long user;

    /**
     * access_token
     */
    private String accessToken;

    /**
     * refresh_token
     */
    private String refreshToken;

    /**
     * 状态
     */
    private Object state;

    /**
     * 登录时间
     */
    private Date accessTime;

    /**
     * 刷新时间
     */
    private Date refreshTime;

    private Object device;

    /**
     * 队列unquie_key
     */
    private String queueListener;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public Date getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(Date refreshTime) {
        this.refreshTime = refreshTime;
    }

    public Object getDevice() {
        return device;
    }

    public void setDevice(Object device) {
        this.device = device;
    }

    public String getQueueListener() {
        return queueListener;
    }

    public void setQueueListener(String queueListener) {
        this.queueListener = queueListener;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", user=").append(user);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", state=").append(state);
        sb.append(", accessTime=").append(accessTime);
        sb.append(", refreshTime=").append(refreshTime);
        sb.append(", device=").append(device);
        sb.append(", queueListener=").append(queueListener);
        sb.append("]");
        return sb.toString();
    }
}