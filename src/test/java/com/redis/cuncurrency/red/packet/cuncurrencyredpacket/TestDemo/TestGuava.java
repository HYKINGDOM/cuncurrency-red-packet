package com.redis.cuncurrency.red.packet.cuncurrencyredpacket.TestDemo;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGuava {

    @Test
    public void test_guava_string(){
        testString("sdasd","dasdas","dasdasd");
    }

    public void testString(String... strings){
        if (strings instanceof String[]) {
            System.out.println("44444444444");
        }
        ArrayList<String> stringArrayList = Lists.newArrayList(strings);

        for (String string : strings) {
            System.out.println();
        }
    }
}
