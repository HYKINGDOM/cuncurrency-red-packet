package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.controller;

import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.BaseApiTest;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.domain.RedPacketRecord;
import com.redis.cuncurrency.red.packet.cuncurrencyredpacket.mapper.RedPacketRecordMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RedPacketRecordControllerTest extends BaseApiTest {


    @Autowired
    private RedPacketRecordMapper redPacketRecordMapper;

    @Test
    void getRedPacketInfo() {
        RedPacketRecord redPacketRecordMock = RedPacketRecord.of(1, null, null, null, null, null, null, null);
        List<Map<String, Object>> getUrlObjectList = given()
                .contentType("application/json")
                .body(redPacketRecordMock)
                .when()
                .get("/api/red_packet_record")
                .then().statusCode(200)
                .extract().body().jsonPath().getList("$");

        List<RedPacketRecord> redPacketRedcord = redPacketRecordMapper.getRedPacketRedcord(redPacketRecordMock);
        assertNotNull(redPacketRedcord);
        assertEquals(redPacketRedcord.get(0).getId(), getUrlObjectList.get(0).get("id"));
    }

    @Test
    void createRedPacketRecord() {
        RedPacketRecord redPacketRecordMock = RedPacketRecord.of(null, randomInt(3), randomName(), "/img/first.jpg", 1, Long.valueOf("1"), new Date(), new Date());
        String aBoolean = given()
                .contentType("application/json")
                .body(redPacketRecordMock)
                .when()
                .post("/api/red_packet_record")
                .then()
                .statusCode(200).extract().body().asString().trim();
        assertTrue(Boolean.parseBoolean(aBoolean));
        redPacketRecordMock.setCreateTime(null);
        redPacketRecordMock.setUpdateTime(null);
        List<RedPacketRecord> redPacketRedcord = redPacketRecordMapper.getRedPacketRedcord(redPacketRecordMock);
        assertNotNull(redPacketRedcord);
        assertEquals(redPacketRedcord.get(0).getRedPacketId(), redPacketRecordMock.getRedPacketId());
        assertEquals(redPacketRedcord.get(0).getUid(), redPacketRecordMock.getUid());
    }
}