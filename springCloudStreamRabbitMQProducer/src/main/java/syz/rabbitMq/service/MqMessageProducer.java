package syz.rabbitMq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;



import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import syz.rabbitMq.channelConfig.MqMessageSource;

import javax.annotation.Resource;

@EnableBinding(MqMessageSource.class)
public class MqMessageProducer {
    @Resource
    private MessageChannel channel; //消息发送通道

    public void sendBrandAdd() {
        channel.send(MessageBuilder.withPayload("hello+你好").build());

    }
}
