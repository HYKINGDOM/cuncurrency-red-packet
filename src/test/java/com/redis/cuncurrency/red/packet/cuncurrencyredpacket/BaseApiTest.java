package com.redis.cuncurrency.red.packet.cuncurrencyredpacket;

import io.restassured.config.EncoderConfig;
import io.restassured.config.LogConfig;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.module.mockmvc.config.RestAssuredMockMvcConfig;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
//Start app for every test method in a test class, enabling this requires more time to run:
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public abstract class BaseApiTest {

    @Autowired

    protected WebApplicationContext context;

    @BeforeEach
    public void init() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }


    @AfterEach
    public void reset() {
        RestAssuredMockMvc.reset();
    }


    protected MockMvcRequestSpecification given() {
        return RestAssuredMockMvc.given()
                .config(RestAssuredMockMvcConfig.config().encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .config(RestAssuredMockMvcConfig.config().logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails()));
    }

    public String randomName() {
        int min = 3;
        int max = 9;
        String name;
        char[] nameChar;
        //名字最长为max个,最短为min个
        int nameLength = (int) (Math.random() * (max - min + 1)) + min;
        nameChar = new char[nameLength];
        //生成大写首字母
        nameChar[0] = (char) (Math.random() * 26 + 65);
        for (int i = 1; i < nameLength; i++) {
            nameChar[i] = (char) (Math.random() * 26 + 97);
        }
        name = new String(nameChar);
        return name;
    }

}
