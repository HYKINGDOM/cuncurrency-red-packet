package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RedPacketInfoMapper {

    List<RedPacketInfo> getRedPacketInfo(RedPacketInfo redPacketInfo);



    void createRedPacketInfo(RedPacketInfo redPacketInfo);
}
