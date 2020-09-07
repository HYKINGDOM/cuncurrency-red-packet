package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取用户信息接口
 *
 * @author hy852
 */
@RestController
@RequestMapping("/api/user")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/{userId}")
    public UserInfo getUserInfoByUserId(@PathVariable int userId) {
        return userInfoService.getUserInfoByUserId(userId);
    }

}
