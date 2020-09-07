package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper {


    UserInfo getUserInfoByUserId(@Param("userId") int userId);
}
