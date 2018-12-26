package com.consInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {

	private int userId;
	private String userName;
	
	private Pancard pancard;
	@Autowired
	public User(int userId, String userName, Pancard pancard) {
		this.userId = userId;
		this.userName = userName;
		this.pancard = pancard;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param pancard the pancard to set
	 */
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the pancard
	 */
	public Pancard getPancard() {
		return pancard;
	}
	@PostConstruct
	public void init() {
		System.out.println("method initialize");
	}
	@PreDestroy
	public static void distroy() {
		System.out.println("method destroy");
	}
}
