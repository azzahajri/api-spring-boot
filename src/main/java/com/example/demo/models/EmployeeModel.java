package com.example.demo.models;

public class EmployeeModel {
	private String EmployeeFirstName;
	private String EmployeeLastName;
	private String EmployeePhoneNumber;
	private long departementId;
	public long getDepartementId() {
	return departementId;
	}
	public void setDepartementId(long departementId) {
	this.departementId = departementId;
	}
	public String getEmployeeFirstName() {
	return EmployeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
	EmployeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
	return EmployeeLastName;

	}
	public void setEmployeeLastName(String employeeLastName) {
	EmployeeLastName = employeeLastName;
	}
	public String getEmployeePhoneNumber() {
	return EmployeePhoneNumber;
	}
	public void setEmployeePhoneNumber(String employeePhoneNumber) {
	EmployeePhoneNumber = employeePhoneNumber;
	}
}