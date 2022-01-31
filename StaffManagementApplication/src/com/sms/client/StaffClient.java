package com.sms.client;

import java.util.Scanner;
import com.sms.details.StaffDetails;

public class StaffClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("                1)Staff                   ");
			System.out.println("                2)Exit                    ");
			System.out.println("------------------------------------------");
			
			System.out.println("Enter The Choice ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				StaffDetails details = new StaffDetails();
				details.staMenu();
				break;
			case 2:
				System.out.println("Thanks for using");
				System.exit(0);
			default:
				System.out.println("Choose 1 or 2");
			}
		}
	}

}
