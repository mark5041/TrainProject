package com.betacom.train;

import com.betacom.train.email.EmailSenderService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrainApplicationTests {

	@Test
	void contextLoads() {
		
		
		EmailSenderService senderService = new EmailSenderService();
		senderService.sendEmail("mark.beloso5041@gmail.com", "Email conferma", "https://youtu.be/EXy83qr9jrI");
		
	}

}
