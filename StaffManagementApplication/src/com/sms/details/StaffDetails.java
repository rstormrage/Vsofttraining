package com.sms.details;

import java.util.ArrayList;
import java.util.Scanner;

import com.sms.bean.User;
import com.sms.client.StaffClient;
import com.sms.dao.Impl.StaffDaoImpl;



public class StaffDetails {
	
	static Scanner sc = new Scanner(System.in);
	static StaffDaoImpl daoImpl = new StaffDaoImpl();
	
	public static void accountMenu() {
		//boolean loop = true;
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                1)AddUser                 ");
			System.out.println("                2)ViewAllUser             ");
			System.out.println("                3)ViewUser                ");
			System.out.println("                4)Back                    ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				daoImpl.addStaffs();
				accountMenu();
				break;
			case 2:
				ArrayList<User> view = daoImpl.viewAllStaff();
				User viewAllUsers[] = daoImpl.viewAllStaffs();
				System.out.println("-------------------------------------------------------------------");
				System.out.println("User ID     User Name     Email ");	
				System.out.println("-------------------------------------------------------------------");
				if(viewAllUsers != null) {
					for(User user: viewAllUsers) {
						if(user != null) {
							System.out.println(user.toString());
						}else break;
					}
				}else {
					System.out.println("User information is not available");
				}
				//System.out.println(view);
				accountMenu();
				break;
			case 3:
				System.out.println("Enter the User number");
				int userid = sc.nextInt();
				if (userid > StaffDaoImpl.pointer) {
					System.out.println("User record is not available");
					break;
				}
				User user = daoImpl.viewStaff(userid);
				System.out.println("-------------------------------------------------------------------");
				System.out.println("User ID     User Name     Email ");	
				System.out.println("-------------------------------------------------------------------");
				if(user != null) {
					System.out.println(user.toString());
				}else {
					System.out.println("User record is not available");
				}
				break;
			case 4:
				StaffClient client = new StaffClient();
				client.main(null);
			default:
				System.out.println("Choose 1 to 4");
			}
		}
	}
	

	/*public void staMenu() {
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                 1)Register               ");
			System.out.println("                 2)login                  ");			
			System.out.println("                 3)Back                   ");
			System.out.println("------------------------------------------");
			
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				daoImpl.register();
				staMenu();
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
	}*/

}
