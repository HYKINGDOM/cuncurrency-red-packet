package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RedPacketInfoMapper {

    List<RedPacketInfo> getRedPacketInfo(RedPacketInfo redPacketInfo);



    void createRedPacketInfo(RedPacketInfo redPacketInfo);
}
