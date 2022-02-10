package com.ems.details;

import java.util.Scanner;

import com.ems.client.EmployeeClient;
import com.ems.dao.EmployeeDAO;
import com.ems.dao.impl.EmployeeDAOImpl;
import com.ems.pojo.Employee;

public class EmployeeDetails {
	Scanner sc = new Scanner(System.in);
	EmployeeDAO emDAO = new EmployeeDAOImpl();
	public void employeeDetail(){
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("              1)AddEmployee               ");
			System.out.println("              2)ViewAllEmployee           ");
			System.out.println("              3)ViewEmployee              ");
			System.out.println("              4)UpdateEmployee            ");
			System.out.println("              5)DeleteEmployee            ");
			System.out.println("              6)Exit                      ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				emDAO.addEmployee();
				break;
			case 2:
				System.out.println(emDAO.viewAllEmployee());				
				break;
			case 3:
				System.out.println("Enter the Employee number");
				int id = sc.nextInt();
				
				Employee em = emDAO.viewEmployee(id);
				System.out.println(em);
				break;
			case 4:
				emDAO.updateEmployee();
				break;
			case 5:
				emDAO.deleteEmployee();
				break;
				
			case 6:
				EmployeeClient ec = new EmployeeClient();
				ec.main(null);
				break;				
			default:
				System.out.println("Choose 1 to 6");
				break;
			}

		}
		
	}

}

