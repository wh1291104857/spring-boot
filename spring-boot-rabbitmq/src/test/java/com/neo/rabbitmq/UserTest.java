package com.neo.rabbitmq;

import com.neo.rabbit.user.UserRegistrationSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserRegistrationSender userRegistrationSender;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 1000; i++) {
            userRegistrationSender.send("{timeStamp=1574319984, phone=18664323974, inviteCode=01731F, _sign=cbf2f2790c88829c8f3ba5f5976d2363}");
        }
    }
}