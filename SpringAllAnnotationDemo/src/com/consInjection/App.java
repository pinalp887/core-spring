package com.consInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext2.xml");
		User user=context.getBean("user",User.class);
		System.out.println(user.getUserId()+" "+user.getUserName()+" "+user.getPancard().getName()+" "+user.getPancard().getPanNo());
		context.close();
	}
}
