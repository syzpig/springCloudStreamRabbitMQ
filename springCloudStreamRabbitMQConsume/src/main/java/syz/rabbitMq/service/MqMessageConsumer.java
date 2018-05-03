package syz.rabbitMq.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import syz.rabbitMq.listen.MqMessageSource;

@EnableBinding(MqMessageSource.class)
public class MqMessageConsumer {

    @StreamListener(MqMessageSource.ECM_SHOP_TEMPLATE_INPUT)
    public void receive(Message<String> message) {
        String payload = message.getPayload();
        System.out.println(payload + "============");
    }
}
