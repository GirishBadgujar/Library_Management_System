package com.example.library.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.library.service.EmailService;

@Controller
public class ForgetpasswordController {
    @Autowired
	private EmailService emailService;
	
	
@RequestMapping("/forget")	
public String openEmailForm()
{
	return "Basic/forget_email-form";
//	return "Basic/forgetpassword";
}

@PostMapping("/send-otp")
public String sendOtp(@RequestParam("email")String email)
{
	System.out.println("Email");
	// generating otp of four digit
	
	Random random= new Random(1000); //minimum four digit value
	
	int otp = random.nextInt(9999999); //upper bound
	System.out.println( "otp is "+ otp);
	
	// write code to send otp to email...
	String subject ="otp from ";
	String message ="otp";
	String to= "email";
	
	boolean flag=this.emailService.sendEmail(subject, message, to);
	
	if(flag)
	{
		return "Basic/verify_otp";
	}
	else
	{
	//	session.setAttribute("message","check email is");
		return "Basic/forget_email-form";
		
	}
	
	
	
	
}

}
