package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.BaseApiTest;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketInfo;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.RedPacketInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RedPacketInfoControllerTest extends BaseApiTest {

    @Autowired
    private RedPacketInfoMapper redPacketInfoMapper;

    @Test
    public void test_get_red_packet_info() {
        RedPacketInfo redPacketInfoMock = RedPacketInfo.of(1, null, null, null, null, null, null, null, null);
        List<Map<String, Object>> getUrlObjectList = given()
                .contentType("application/json")
                .body(redPacketInfoMock)
                .when()
                .get("/api/red_packet_info")
                .then().statusCode(200)
                .extract().body().jsonPath().getList("$");

        List<RedPacketInfo> getQueryObjectList = redPacketInfoMapper.getRedPacketInfo(redPacketInfoMock);
        assertNotNull(getQueryObjectList);
        assertNotNull(getUrlObjectList);
        assertEquals(getQueryObjectList.get(0).getId(), getUrlObjectList.get(0).get("id"));
    }

    @Test
    public void test_create_red_packet_info() {
        RedPacketInfo redPacketInfoMock = RedPacketInfo.of(null, Long.valueOf(randomInt(8)), randomInt(8), randomInt(3), randomInt(5), randomInt(2), 1, new Date(), new Date());
        String aBoolean = given()
                .contentType("application/json")
                .body(redPacketInfoMock)
                .when()
                .post("/api/red_packet_info")
                .then()
                .statusCode(200).extract().body().asString().trim();
        assertTrue(Boolean.parseBoolean(aBoolean));
        redPacketInfoMock.setCreateTime(null);
        redPacketInfoMock.setUpdateTime(null);
        List<RedPacketInfo> redPacketInfo = redPacketInfoMapper.getRedPacketInfo(redPacketInfoMock);
        assertNotNull(redPacketInfo);
        assertEquals(redPacketInfo.get(0).getRedPacketId(), redPacketInfoMock.getRedPacketId());
        assertEquals(redPacketInfo.get(0).getUid(), redPacketInfoMock.getUid());
    }
}