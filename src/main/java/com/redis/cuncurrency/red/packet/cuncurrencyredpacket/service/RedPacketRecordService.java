package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketRecord;

import java.util.List;

public interface RedPacketRecordService {

    List<RedPacketRecord> getRedPacketRecord(RedPacketRecord redPacketRecord);

    Boolean createRedPacketRecord(RedPacketRecord redPacketRecord);
}
