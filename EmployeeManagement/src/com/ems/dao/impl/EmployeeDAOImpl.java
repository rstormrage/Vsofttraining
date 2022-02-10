package com.ems.dao.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> elist = new ArrayList<>();

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("How many employee do you want to add");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Employee ID");
			int eno = sc.nextInt();
			System.out.println("Enter Employee Name");
			String ename = sc.next();
			System.out.println("Enter Employee Email");
			String email = sc.next();
			System.out.println("Enter Employee Address");
			String eadd = sc.next();
			System.out.println("Enter Employee Phone Number");
			long eph = sc.nextLong();
			Employee em = new Employee(eno, ename, eadd, eph, email);			
			elist.add(em);
			System.out.println("Added successfully");
		}
	}

	@Override
	public ArrayList<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return elist;
	}

	@Override
	public Employee viewEmployee(int eno) {
		// TODO Auto-generated method stub
		for(Employee em: elist) {
			if(em.getEno() == eno)
				return em;
		}
		return null;
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Employee Number you want to update");
		int eno = sc.nextInt();		
		int index = 0;
		for(Employee emp: elist) {
			if(emp.getEno() == eno) {
				index = elist.indexOf(emp);
				System.out.println(elist.get(index));
				System.out.println("Enter Employee ID");
				eno = sc.nextInt();
				System.out.println("Enter Employee Name");
				String ename = sc.next();
				System.out.println("Enter Employee Email");
				String email = sc.next();
				System.out.println("Enter Employee Address");
				String eadd = sc.next();
				System.out.println("Enter Employee Phone Number");
				long eph = sc.nextLong();
				Employee newEm = new Employee(eno, ename, eadd, eph, email);
				
				System.out.println(newEm);
				elist.set(index, newEm);
				
			}else {
				System.out.println("Employee does not exist");
			}
			
		}
		

	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Employee Number you want to delete");
		int eno = sc.nextInt();
		
		int index = 0;
		
		for(Employee emp: elist) {
			if(emp.getEno() == eno) {
				index = elist.indexOf(emp);
				System.out.println(elist.get(index));
				elist.remove(index);
				System.out.println("Deleted successfully");
				
			}else {
				System.out.println("Employee does not exist");
			}
			
		}

	}

}
