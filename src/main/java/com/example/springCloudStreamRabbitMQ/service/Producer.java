package com.example.springCloudStreamRabbitMQ.service;

import com.example.springCloudStreamRabbitMQ.rabbitMqConfig.RabbitMqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Producer {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass());
    //创建生产者  通过注入AmqpTemplate接口的实例来实现消息的发送，它定义了一套针对AMQP协议的基础操作。
    //springboot会根据配置来注入其具体实现，，在该生产中，我们会把数据发送到名为（RabbitMqConfig.queueName）springcloud-server-bus-rabbitmq的队列中
    @Autowired
    private AmqpTemplate rabbitMqTemplate;

    public void send() {
        String context = "hello" + new Date();
        _logger.info("正在向队列发送消息：{}", context);
        this.rabbitMqTemplate.convertAndSend(RabbitMqConfig.queueName, context);
    }
}
