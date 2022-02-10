package com.ems.dao;

import java.util.ArrayList;

import com.ems.pojo.Employee;

public interface EmployeeDAO {
	public void addEmployee();
	public ArrayList<Employee> viewAllEmployee();
	public Employee viewEmployee(int eno);
	public void updateEmployee();
	public void deleteEmployee();
	

}
