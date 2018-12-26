package com.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
import com.model.Pancard;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee.getEmployeeId()+"  "+employee.getEmployeeName()+"  "+employee.getPancard().getPanHolderName()+"  "+employee.getPancard().getPanNumber());
		context.close();
	}
}
