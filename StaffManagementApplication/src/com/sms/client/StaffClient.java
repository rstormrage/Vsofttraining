package com.sms.client;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import com.sms.dao.impl.StaffDaoImpl;
import com.sms.details.StaffDetails;
import com.sms.bean.*;

public class StaffClient {
	static HashSet<User> set = new HashSet<>();
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
				boolean sr = set.contains(user);
				if(!sr) {
					System.out.println("User does not exist");
				}else {
					Iterator<User> iterator = set.iterator();
					while(iterator.hasNext()) {
						User user2 = iterator.next();
						if(user2.getUserName().equals(userName) && user2.getPassWord().equals(passWord)) {
							details.accountMenu();
						}
					}
				}
				/*boolean flag = daoImpl.logIn(userName, passWord);
				if(flag == false) {
					System.out.println("Your UserName doesn't match your PassWord");
					break;
				}else {
					StaffDetails detail = new StaffDetails();
					detail.accountMenu();
				}*/
			}
		}
	}

}
