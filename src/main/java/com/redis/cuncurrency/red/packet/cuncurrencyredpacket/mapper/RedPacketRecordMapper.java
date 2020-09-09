package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RedPacketRecordMapper {

    List<RedPacketRecord> getRedPacketRedcord(RedPacketRecord redPacketRecord);


    void createRedPacketRecord(RedPacketRecord redPacketRecord);
}
