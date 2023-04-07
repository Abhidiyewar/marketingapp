package com.marketingapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceimpl implements EmailService {
	
	@Autowired
	private JavaMailSender javamailSender;

	@Override
	public void SendEmail(String to, String Sub, String msg) {
	
		SimpleMailMessage mailMsg = new SimpleMailMessage();
		mailMsg.setTo(to);
		mailMsg.setSubject(Sub);
		mailMsg.setText(msg);
		
		javamailSender.send(mailMsg);
	}

}
