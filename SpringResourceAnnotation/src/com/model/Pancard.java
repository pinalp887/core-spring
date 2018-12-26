package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {
	@Value("#{employee.employeeName}")
	private String panHolderName;
	@Value("HGCAHVA54")
	private String panNumber;
	/**
	 * @return the panHolderName
	 */
	public String getPanHolderName() {
		return panHolderName;
	}
	/**
	 * @param panHolderName the panHolderName to set
	 */
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	/**
	 * @return the panNumber
	 */
	public String getPanNumber() {
		return panNumber;
	}
	/**
	 * @param panNumber the panNumber to set
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
}
