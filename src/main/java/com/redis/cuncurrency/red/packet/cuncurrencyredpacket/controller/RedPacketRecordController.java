package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketRecord;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.RedPacketRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hy
 */
@RestController
@RequestMapping("/api/red_packet_record")
public class RedPacketRecordController {

    @Autowired
    private RedPacketRecordService redPacketRecordService;

    @GetMapping("")
    public List<RedPacketRecord> getRedPacketInfo(@RequestBody RedPacketRecord redPacketRecord) {
        return redPacketRecordService.getRedPacketRecord(redPacketRecord);
    }


    @PostMapping("")
    public Boolean createRedPacketRecord(@RequestBody RedPacketRecord redPacketRecord) {
        return redPacketRecordService.createRedPacketRecord(redPacketRecord);
    }

}
