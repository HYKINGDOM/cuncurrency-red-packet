package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.serviceImp;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketRecord;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.RedPacketRecordMapper;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.RedPacketRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedPacketRecordServiceImpl implements RedPacketRecordService {

    @Autowired
    private RedPacketRecordMapper redPacketRecordMapper;

    @Override
    public List<RedPacketRecord> getRedPacketRecord(RedPacketRecord redPacketRecord) {
        return redPacketRecordMapper.getRedPacketRedcord(redPacketRecord);
    }

    @Override
    public Boolean createRedPacketRecord(RedPacketRecord redPacketRecord) {
        try {
            redPacketRecordMapper.createRedPacketRecord(redPacketRecord);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
        return true;
    }


}
