package com.neo.rabbitmq;

import com.neo.rabbit.work.WorkSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkTest {

    @Autowired
    private WorkSend workSender;

    @Test
    public void send() throws Exception {
        workSender.send();
    }
}