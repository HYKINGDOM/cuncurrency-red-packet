package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RedPacketRecordMapper {

    List<RedPacketRecord> getRedPacketRedcord(RedPacketRecord redPacketRecord);


    void createRedPacketRecord(RedPacketRecord redPacketRecord);
}
