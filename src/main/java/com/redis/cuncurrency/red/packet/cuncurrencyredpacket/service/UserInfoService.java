package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;

import java.util.List;

/**
 *
 */
public interface UserInfoService {

    List<UserInfo> getUserInfoByUserId(UserInfo userId);

    Boolean createUserInfoByUserId(UserInfo userInfo);
}
