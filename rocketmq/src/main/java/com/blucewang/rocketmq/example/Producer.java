package com.blucewang.rocketmq.example;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.common.message.Message;

/**
 * Created by bluceWang on 2018/1/5.
 */
public class Producer {
    public static void main(String[] args) {
        DefaultMQProducer producer = new DefaultMQProducer("p-group");
        producer.setNamesrvAddr("36.106.38.182:9876");
        producer.setInstanceName("p-one");
        for (int i=1;i<10;i++){
            new Message();
        }
    }
}
