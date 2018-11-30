package com.example.demo.trySpring;

import lombok.Data;

@Data
public class Employee {

	private int employeeId;		//従業員ID
	private String employeeName;//従業員名
	private int age;			//年齢
	
	public Object getEmployeeId() {
		return this.employeeId;
	}
	public Object getEmployeeName() {
		return this.employeeName;
	}
	public Object getAge() {
		return this.age;
	}
	public void setEmployeeId(int employeeId2) {
		employeeId = employeeId2;
	}
	public void setEmployeeName(String employeeName2) {
		employeeName = employeeName2;
	}
	public void setAge(int age2) {
		age = age2;
	}
}
