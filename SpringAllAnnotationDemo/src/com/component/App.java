package com.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext3.xml");
		User user=context.getBean("user",User.class);
		System.out.println(user.getId()+"  "+user.getName()+" "+user.getPancard().getName()+" "+user.getPancard().getPanNumber());
		context.close();
	}
}
