package com.mts.details;

import java.util.Scanner;

import com.mts.client.MainClient;
import com.mts.dao.AdminDAO;
import com.mts.dao.AdminDAOImpl;
import com.mts.dao.CustomerDAO;
import com.mts.dao.CustomerDAOImple;

public class CustomerDetails {
	Scanner sc = new Scanner(System.in);
	CustomerDAO cuDAO = new CustomerDAOImple();
	AdminDAO aDAO = new AdminDAOImpl();
	
	public void CustomerMainMenu() {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                1)ViewAllMovie            ");
			System.out.println("                2)YourMovie               ");
			System.out.println("                3)BookMovie               ");
			System.out.println("                4)CancelMovie             ");
			System.out.println("                5)Back                    ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println(cuDAO.viewAllMovie());
					break;
				case 2:
					cuDAO.yourMovie();
					break;
				case 3:
					cuDAO.bookMovie();
					break;
				case 4:
					cuDAO.cancelMovie();
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
