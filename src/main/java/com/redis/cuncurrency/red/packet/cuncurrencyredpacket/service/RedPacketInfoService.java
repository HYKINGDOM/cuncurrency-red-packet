package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;

import java.util.List;

public interface RedPacketInfoService {

    List<RedPacketInfo> getRedPacketInfo(RedPacketInfo redPacketInfo);

    Boolean createRedPacketInfo(RedPacketInfo redPacketInfo);
}
