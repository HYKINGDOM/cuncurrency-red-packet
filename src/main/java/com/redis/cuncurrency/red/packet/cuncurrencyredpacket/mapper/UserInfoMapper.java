package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {


    List<UserInfo> getUserInfoByUserId(UserInfo userInfo);

    void CreateUserInfoByUserId(UserInfo userInfo);
}
