package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.BaseApiTest;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.UserInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoControllerTest extends BaseApiTest {

    @Autowired
    private UserInfoMapper userInfoMapper;


    /**
     * jsonPath返回值是list时getList("&")返回根数组,这个方法返回list当中不是实体对象而是Map
     */
    @Test
    public void test_get_user_info() {
        UserInfo userInfo = UserInfo.of(1, null, null, null, null, null, null);
        List<Map<String, Object>> objectList = given()
                .contentType("application/json")
                .body(userInfo)
                .when()
                .get("/api/user/")
                .then().statusCode(200)
                .extract().body().jsonPath().getList("$");
        List<UserInfo> userInfoByUserId = userInfoMapper.getUserInfoByUserId(userInfo);
        assertNotNull(userInfoByUserId);
        assertNotNull(objectList);
        assertEquals(userInfoByUserId.get(0).getId(), objectList.get(0).get("id"));
    }

    @Test
    public void test_create_user_info() {
        String randomUserName = randomName();
        String randomNickName = randomName();
        UserInfo userInfoMock = UserInfo.of(null, randomUserName, randomNickName, "/img/first.jpg", 1, new Date(), new Date());
        String aBoolean = given()
                .contentType("application/json")
                .body(userInfoMock)
                .when()
                .post("/api/user")
                .then()
                .statusCode(200).extract().body().asString().trim();
        assertTrue(Boolean.parseBoolean(aBoolean));
        userInfoMock.setCreateTime(null);
        userInfoMock.setUpdateTime(null);
        List<UserInfo> userInfoList = userInfoMapper.getUserInfoByUserId(userInfoMock);
        assertNotNull(userInfoList);
        UserInfo userInfo = userInfoList.get(0);

        assertEquals(userInfo.getUserName(), userInfoMock.getUserName());
        assertEquals(userInfo.getNickName(), userInfoMock.getNickName());
    }

}