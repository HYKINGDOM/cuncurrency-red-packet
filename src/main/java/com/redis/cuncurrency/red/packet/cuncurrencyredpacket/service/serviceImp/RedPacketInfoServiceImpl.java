package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.serviceImp;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.RedPacketInfoMapper;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.RedPacketInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedPacketInfoServiceImpl implements RedPacketInfoService {

    private final RedPacketInfoMapper redPacketInfoMapper;

    public RedPacketInfoServiceImpl(RedPacketInfoMapper redPacketInfoMapper) {
        this.redPacketInfoMapper = redPacketInfoMapper;
    }

    @Override
    public List<RedPacketInfo> getRedPacketInfo(RedPacketInfo redPacketInfo) {
        return redPacketInfoMapper.getRedPacketInfo(redPacketInfo);
    }

    @Override
    public Boolean createRedPacketInfo(RedPacketInfo redPacketInfo) {

        try {
            redPacketInfoMapper.createRedPacketInfo(redPacketInfo);
        }catch (Exception e){
            e.getMessage();
            return false;
        }
        return true;
    }
}