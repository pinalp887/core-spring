package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Pancard pancard;
	@Autowired
	public Employee(int employeeId, String employeeName, Pancard pancard) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.pancard = pancard;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @return the pancard
	 */
	public Pancard getPancard() {
		return pancard;
	}

}
