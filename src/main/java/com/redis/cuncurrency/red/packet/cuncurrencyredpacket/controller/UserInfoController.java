package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;


import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.service.UserInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<UserInfo> getUserInfoByUserId(@RequestBody UserInfo userInfo) {
        return userInfoService.getUserInfoByUserId(userInfo);
    }


    @PostMapping("")
    public Boolean createUserInfoByUserId(@RequestBody UserInfo userInfo) {
        return userInfoService.CreateUserInfoByUserId(userInfo);
    }


}
