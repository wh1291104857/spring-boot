package com.neo.rabbit.user;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserRegistrationSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(String message) {
		this.rabbitTemplate.convertAndSend("UserRegistration", message);
	}

}