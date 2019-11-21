package com.neo.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "topic.messagess")
public class TopicReceiver3 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver3  : " + message);
    }

}
