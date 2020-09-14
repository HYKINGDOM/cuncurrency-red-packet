package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserInfoMapper {


    List<UserInfo> getUserInfoByUserId(UserInfo userInfo);

    void createUserInfoByUserId(UserInfo userInfo);
}
