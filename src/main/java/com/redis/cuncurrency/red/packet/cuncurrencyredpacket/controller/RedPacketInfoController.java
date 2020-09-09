package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.RedPacketInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/")
    public RedPacketInfo getRedPacketInfo(@RequestBody RedPacketInfo redPacketInfo) {
        return redPacketInfoService.getRedPacketInfo(redPacketInfo);
    }


    public Boolean postRedPacketInfo
}
