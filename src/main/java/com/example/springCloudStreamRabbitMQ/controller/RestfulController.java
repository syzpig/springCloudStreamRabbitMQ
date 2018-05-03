package com.example.springCloudStreamRabbitMQ.controller;


import com.example.springCloudStreamRabbitMQ.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {
    @Autowired
    Producer producer;
    @GetMapping("/message")
    public void message(){
        producer.send();
    }
}
