package com.example.springCloudStreamRabbitMQ.service;


import com.example.springCloudStreamRabbitMQ.rabbitMqConfig.RabbitMqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//通过该注解定义该类对队列进行监听
@RabbitListener(queues = RabbitMqConfig.queueName)
public class Consumer {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;

    @RabbitHandler //@RabbitHandler注解来指定对消息处理方法
    public void consumer(String message) {
        _logger.info("从队列获取到的消息:{}", message);
    }
}