package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain;

import java.util.Date;

/**
 * 红包基本信息
 *
 * @author hy
 */
public class RedPacketInfo {

    /**
     * 自增id
     */
    private Integer id;
    /**
     * 红包id
     */
    private Long redPacketId;
    /**
     * 红包总个数
     */
    private Integer totalAmount;
    /**
     * 红包总个数
     */
    private Integer totalPacket;
    /**
     * 剩余红包金额
     */
    private Integer remainingAmount;
    /**
     * 剩余红包个数
     */
    private Integer remainingPacket;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public RedPacketInfo() {
    }

    public RedPacketInfo(Integer id, Long redPacketId, Integer totalAmount, Integer totalPacket, Integer remainingAmount, Integer remainingPacket, Integer uid, Date createTime, Date updateTime) {
        this.id = id;
        this.redPacketId = redPacketId;
        this.totalAmount = totalAmount;
        this.totalPacket = totalPacket;
        this.remainingAmount = remainingAmount;
        this.remainingPacket = remainingPacket;
        this.uid = uid;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }


    public static RedPacketInfo of(Integer id, Long redPacketId, Integer totalAmount, Integer totalPacket, Integer remainingAmount, Integer remainingPacket, Integer uid, Date createTime, Date updateTime) {
        return new RedPacketInfo(id, redPacketId, totalAmount, totalPacket, remainingAmount, remainingPacket, uid, createTime, updateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalPacket() {
        return totalPacket;
    }

    public void setTotalPacket(Integer totalPacket) {
        this.totalPacket = totalPacket;
    }

    public Integer getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Integer remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Integer getRemainingPacket() {
        return remainingPacket;
    }

    public void setRemainingPacket(Integer remainingPacket) {
        this.remainingPacket = remainingPacket;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

}
