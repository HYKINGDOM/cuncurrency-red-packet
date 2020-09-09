package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RedPacketInfoMapper {

    RedPacketInfo getRedPacketInfo(RedPacketInfo redPacketInfo);
}
