package com.neo.rabbit.work;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkSend {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        for (int i = 0; i < 10; i++) {
            String msg = "work message" + i;
            System.out.println("send =====:".concat(msg));
            rabbitTemplate.convertAndSend("work-queue", msg);
        }
    }
}
