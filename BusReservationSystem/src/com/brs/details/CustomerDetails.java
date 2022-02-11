package com.brs.details;

import java.util.Scanner;

import com.brs.client.MainClient;
import com.brs.dao.AdminDAO;
import com.brs.dao.AdminDAOImpl;
import com.brs.dao.CustomerDAO;
import com.brs.dao.CustomerDAOImpl;

public class CustomerDetails {
	Scanner sc = new Scanner(System.in);
	CustomerDAO cuDAO = new CustomerDAOImpl();
	AdminDAO aDAO = new AdminDAOImpl();
	
	public void CustomerMainMenu() {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                 1)ViewAllBus             ");
			System.out.println("                 2)YourBus                ");
			System.out.println("                 3)BookBus                ");
			System.out.println("                 4)CancelBus              ");
			System.out.println("                 5)Back                   ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println(cuDAO.viewAllBus());
					break;
				case 2:
					cuDAO.yourBus();
					break;
				case 3:
					cuDAO.bookBus();
					break;
				case 4:
					cuDAO.cancelBus();
					break;
				case 5:
					MainClient mc = new MainClient();
					mc.main(null);
					break;
				default:
					System.out.println("Choose 1 to 5");
					break;
			}
		}
	}
}
