package com.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Message;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
	Message message=context.getBean("message",Message.class);
	System.out.println(message.getMessageId()+"   "+message.getMessage());
	context.close();
}
}
