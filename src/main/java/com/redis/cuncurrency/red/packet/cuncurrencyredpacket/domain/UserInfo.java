package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Date;

/**
 * 用户基本信息
 *
 * @author hy852
 */
public class UserInfo {

    /**
     * 自增id
     */
    private Integer id;
    /**
     * 用户登录名
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户头像地址
     */
    private String imgUrl;
    /**
     * 该用户是否是会员
     */
    private Integer member;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public UserInfo() {
    }

    public UserInfo(Integer id, String userName, String nickName, String imgUrl, Integer member, Date createTime, Date updateTime) {
        this.id = id;
        this.userName = userName;
        this.nickName = nickName;
        this.imgUrl = imgUrl;
        this.member = member;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }


    public static UserInfo of(Integer id, String userName, String nickName, String imgUrl, Integer member, Date createTime, Date updateTime) {
        return new UserInfo(id, userName, nickName, imgUrl, member, createTime, updateTime);
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", member=" + member +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
