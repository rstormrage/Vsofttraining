package com.mts.details;

import java.util.Scanner;

import com.mts.client.MainClient;
import com.mts.dao.AdminDAO;
import com.mts.dao.AdminDAOImpl;


public class AdminDetails {
	Scanner sc = new Scanner(System.in);
	//CustomerDAO cuDAO = new CustomerDAOImpl();
	AdminDAO aDAO = new AdminDAOImpl();
	public void adminMainMenu() {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                1)AddMovie                ");
			System.out.println("                2)ViewAllMovie            ");
			System.out.println("                3)ViewMovie               ");
			System.out.println("                4)UpdateMovie             ");
			System.out.println("                5)DeleteMovie             ");
			System.out.println("                6)Back                    ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				aDAO.addMovie();
				break;
			case 2:
				System.out.println(aDAO.viewAllMovie());
				break;
			case 3:
				System.out.println("Enter the Bus Number");
				int no = sc.nextInt();
				aDAO.viewmovie(no);
				break;
			case 4:
				aDAO.updateMovie();
				break;
			case 5:
				aDAO.deleteMovie();
				break;
			case 6:
				MainClient mc = new MainClient();
				mc.main(null);
				break;
			default:
				System.out.println("Choose 1 to 6");
				break;
			}
		}
	}

}
