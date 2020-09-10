package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.serviceImp;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.UserInfoMapper;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> getUserInfoByUserId(UserInfo userInfo) {
        return userInfoMapper.getUserInfoByUserId(userInfo);
    }

    @Override
    public Boolean CreateUserInfoByUserId(UserInfo userInfo) {
        try {
            userInfoMapper.CreateUserInfoByUserId(userInfo);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
        return true;
    }
}
