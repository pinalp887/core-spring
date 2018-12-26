package com.model;

import org.springframework.beans.factory.annotation.Required;

public class Message {

	private int messageId;
	private String message;
	/**
	 * @return the messageId
	 */
	public int getMessageId() {
		return messageId;
	}
	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	@Required
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
