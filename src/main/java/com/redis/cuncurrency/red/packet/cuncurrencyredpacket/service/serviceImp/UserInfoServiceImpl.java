package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.serviceImp;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.UserInfoMapper;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public UserInfo getUserInfoByUserId(int userId) {
        return userInfoMapper.getUserInfoByUserId(userId);
    }
}
