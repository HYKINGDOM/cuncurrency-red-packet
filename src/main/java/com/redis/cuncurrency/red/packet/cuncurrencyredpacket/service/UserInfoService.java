package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;

/**
 *
 */
public interface UserInfoService {

    UserInfo getUserInfoByUserId(int userId);
}
