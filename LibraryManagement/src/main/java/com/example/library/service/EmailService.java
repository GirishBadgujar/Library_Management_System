package com.example.library.service;

import org.springframework.stereotype.Service;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailService {

	public  boolean sendEmail(String subject, String message, String to)
	{
	boolean flag= false;
	{
		String from ="amit1covid19@gmail.com";
		
		// variable for gmail
		String host ="smtp.gmail.com";
		
		// get the system properties
		
		Properties properties = System.getProperties();
		System.out.println("Properties" + properties);
		
		//  setting important information to properties object
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", 465);
		properties.put("mail.smtp.ssl.enable", true);
		properties.put("mail.smtp.auth", true);
		
		// step1 to get the session object
	Session session= Session.getInstance(properties, new Authenticator() 
			{
		
	     @Override
	    		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
	    			// TODO Auto-generated method stub
	    	 return new PasswordAuthentication("amit1covid19@gmail.com","Amitbhaiya@1");
	    		}
		{
		//	
		}
		
	});
	session.setDebug(true);
	
	// step2 compose the message[text,multi media]
	MimeMessage m= new MimeMessage(session);
	try {
		// from email
		m.setFrom(from);
		
		m.addRecipient(Message.RecipientType.TO , new InternetAddress(to));
		
		m.setSubject(subject);
		m.setText(message);
		
		Transport.send(m);
		flag= true;
		
		System.out.println("Sent Success................");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	 return flag;
	
	}
}
}
