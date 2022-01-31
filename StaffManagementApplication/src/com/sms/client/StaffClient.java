package com.sms.client;

import java.util.Scanner;

import com.sms.dao.impl.StaffDaoImpl;
import com.sms.details.StaffDetails;

public class StaffClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StaffDaoImpl daoImpl = new StaffDaoImpl();
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
				boolean flag = daoImpl.logIn(userName, passWord);
				if(flag == false) {
					System.out.println("Your UserName doesn't match your PassWord");
					break;
				}else {
					StaffDetails detail = new StaffDetails();
					detail.accountMenu();
				}
			}
		}
	}

}
