package com.mts.client;

import java.util.Scanner;

import com.mts.details.AdminDetails;
import com.mts.details.CustomerDetails;

public class MainClient {
	static Scanner sc = new Scanner(System.in);
	static AdminDetails ad = new AdminDetails();
	static CustomerDetails cd = new CustomerDetails();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                1)Admin                   ");
			System.out.println("                2)Customer                ");
			System.out.println("                3)Exit                    ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ad.adminMainMenu();
				break;
			case 2:
				cd.CustomerMainMenu();
				break;
			case 3:
				System.out.println("Thx for using");
				System.exit(0);
				break;
			default:
				System.out.println("Choose 1 or 2");
				break;
			}
		}
	}

}
