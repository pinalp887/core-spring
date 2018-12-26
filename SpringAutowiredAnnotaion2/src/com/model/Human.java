package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;
	public Human() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param heart the heart to set
	 */@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("in setter");
	}
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("cons");
	}
	public void startPumping() {
		heart.pump();
	}
}
