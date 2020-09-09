package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.RedPacketInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hy852
 */
@RestController
@RequestMapping("/api/red_packet_info")
public class RedPacketInfoController {


    private final RedPacketInfoService redPacketInfoService;

    public RedPacketInfoController(RedPacketInfoService redPacketInfoService) {
        this.redPacketInfoService = redPacketInfoService;
    }

    @GetMapping("")
    public List<RedPacketInfo> getRedPacketInfo(@RequestBody RedPacketInfo redPacketInfo) {
        return redPacketInfoService.getRedPacketInfo(redPacketInfo);
    }

    @PostMapping("")
    public Boolean createRedPacketInfo(@RequestBody RedPacketInfo redPacketInfo) {
        return redPacketInfoService.createRedPacketInfo(redPacketInfo);
    }
}
