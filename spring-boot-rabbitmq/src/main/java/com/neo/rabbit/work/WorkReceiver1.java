package com.neo.rabbit.work;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "work-queue")
public class WorkReceiver1 {

    @RabbitHandler
    public void receive(String str) {
        /*int i = 1;
        if(i == 1){
            throw new NullPointerException();
        }*/
        System.out.println(("WorkReceiver1 =====: ").concat(str));
    }
}
