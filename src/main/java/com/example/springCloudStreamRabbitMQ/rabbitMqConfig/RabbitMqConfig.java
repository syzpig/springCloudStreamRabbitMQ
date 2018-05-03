package com.example.springCloudStreamRabbitMQ.rabbitMqConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

/**
 *rabbitMQ配置类 用来配置队列、交换器、路由等高级信息，这里以入门为主，所以只进行最小化配置
 */
@Configuration
public class RabbitMqConfig {

    public static final String queueName = "springcloud-server-Stream-rabbitmq";

    public Queue rabbitMqQueue() {
        return new Queue(queueName);
    }

}
