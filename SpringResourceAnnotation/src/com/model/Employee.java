package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Value("1")
private int employeeId;
	
	@Value("Pinal")
private String employeeName;
@Autowired
private Pancard pancard;
/**
 * @return the employeeId
 */
public int getEmployeeId() {
	return employeeId;
}
/**
 * @param employeeId the employeeId to set
 */
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
/**
 * @return the employeeName
 */
public String getEmployeeName() {
	return employeeName;
}
/**
 * @param employeeName the employeeName to set
 */
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
/**
 * @return the pancard
 */
public Pancard getPancard() {
	return pancard;
}
/**
 * @param pancard the pancard to set
 */
public void setPancard(Pancard pancard) {
	this.pancard = pancard;
}


}
