package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.bean.User;

public class StaffDaoImpl {
	
	static User addUsers[] = new User[50];
	public static int pointer = 0;
	Scanner sc = new Scanner(System.in);
	
	public void register() {
		System.out.println("Enter Staff ID");
		int id = sc.nextInt();
		System.out.println("Enter Staff First Name");
		String first_name = sc.next();
		System.out.println("Enter Staff Last Name");
		String last_name = sc.next();
		System.out.println("Enter Email");
		String email = sc.next();
		System.out.println("Enter UserName");
		String userName = sc.next();
		System.out.println("Enter PassWord");
		String passWord = sc.next();			
		User user = new User(id, first_name, last_name, email, userName, passWord);
		addUsers[pointer] = user;
		System.out.println("Staff " + id + " Information Registred");
		pointer =+ 1;
	}
	
	public void addStaffs() {
		System.out.println("How many staff do you want to register");
		int size = sc.nextInt();
		
		for (int i = pointer; i < pointer + size; i++) {
			System.out.println("Enter Staff ID");
			int id = sc.nextInt();
			System.out.println("Enter Staff First Name");
			String first_name = sc.next();
			System.out.println("Enter Staff Last Name");
			String last_name = sc.next();
			System.out.println("Enter Email");	
			String email = sc.next();
			System.out.println("Enter UserName");
			String userName = sc.next();
			System.out.println("Enter PassWord");
			String passWord = sc.next();			
			User user = new User(id, first_name, last_name, email, userName, passWord);
			addUsers[i] = user;
			System.out.println("Staff " + (i + 1) + " Information Registred");
		}
		pointer =+ size;
	}
	
	public User[] viewAllStaffs() {
		return addUsers;
	}
	
	public User viewStaff(int id) {
		if(addUsers != null) {
			for(User user: addUsers) {
				if(user.getId() == id) {
					return user;
				}
			}
		}return null;
	}
	
	public boolean logIn(String userName, String passWord) {
		
		
		return true;
		 
	}
	

}
