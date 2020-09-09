package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.BaseApiTest;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserInfoControllerTest extends BaseApiTest {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Test
    public void test_get_user_info() {
        UserInfo userInfo = UserInfo.of(1, null, null, null, null, null, null);
        String id = given()
                .contentType("application/json")
                .when()
                .get("/api/user/" + userInfo.getId())
                .then().statusCode(200)
                .extract().body().jsonPath().getString("id");
        UserInfo userInfoData = userInfoMapper.getUserInfoByUserId(userInfo.getId());
        assertNotNull(userInfoData);
        assertNotNull(id);
        assertEquals(userInfoData.getId(), Integer.valueOf(id));
    }

}