package com.blucewang.rocketmq.example;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.common.RemotingHelper;

import java.io.UnsupportedEncodingException;

/**
 * Created by bluceWang on 2018/1/5.
 */
public class Producer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("p-group");
        producer.setNamesrvAddr("10.20.192.77:9876");
        producer.setInstanceName("p-one");
        producer.start();
        for (int i=1;i<10;i++){
            try {
                Message message = new Message("testTopic", "tag1", ("hello mq" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult sendResult = producer.send(message);
                System.out.println(sendResult);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
