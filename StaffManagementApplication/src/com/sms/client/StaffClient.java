package com.sms.client;

import java.util.Scanner;

import com.sms.dao.Impl.StaffDaoImpl;
import com.sms.details.StaffDetails;
import com.sms.bean.*;

public class StaffClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StaffDaoImpl daoImpl = new StaffDaoImpl();
		StaffDetails details = new StaffDetails();
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("                 1)Register               ");
			System.out.println("                 2)login                  ");
			System.out.println("                 3)Exit                   ");
			System.out.println("------------------------------------------");
			
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				daoImpl.register();
				
				break;
				
			case 2:
				System.out.println("Enter your UserName: ");
				String userName = sc.next();
				System.out.println("Enter your PassWord: ");
				String passWord = sc.next();
				User user = new User(userName, passWord);
				
				boolean flag = daoImpl.logIn(userName, passWord);
				if(flag == false) {
					System.out.println("Your UserName doesn't match your PassWord");
					break;
				}else {
					System.out.println("Log in successfully");
					StaffDetails detail = new StaffDetails();
					detail.accountMenu();
				}
			case 3:
				System.out.println("Thanks for using");
				System.exit(0);
				break;				
			default:
				System.out.println("Enter 1 to 3");
				break;
			}
		}
	}

}
