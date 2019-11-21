package com.neo.rabbit.user;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "UserRegistration")
public class UserRegistrationReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Receiver  : " + message);
    }

}
