package com.noak.design.producerconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author yeww
 * @since 2018-07-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRocketMQ {
    @Resource
    private MQProducer mqProducer;

    @Test
    public void testProducer() {
        for (int i = 0; i < 10; i++) {
            mqProducer.sendMessage("Hello RocketMQ " + i, "test111",
                    "TagTest", "Key" + i);
        }

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
