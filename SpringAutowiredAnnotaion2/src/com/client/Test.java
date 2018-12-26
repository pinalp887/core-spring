package com.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Human;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		Human human=context.getBean("human",Human.class);
		human.startPumping();
	}
}
