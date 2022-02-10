package com.ems.client;

import java.util.Scanner;

import com.ems.details.EmployeeDetails;

public class EmployeeClient {
	static Scanner sc = new Scanner(System.in);
	static EmployeeDetails emd = new EmployeeDetails();
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                1)Employee                ");
			System.out.println("                2)Exit                    ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				emd.employeeDetail();
				break;
			case 2:
				System.out.println("Thx for using");
				System.exit(0);
			default:
				System.out.println("Choose 1 or 2");
			}

		}
	}

}
