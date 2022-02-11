package com.brs.details;

import java.util.Scanner;

import com.brs.client.MainClient;
import com.brs.dao.AdminDAO;
import com.brs.dao.AdminDAOImpl;
import com.brs.dao.CustomerDAO;
import com.brs.dao.CustomerDAOImpl;

public class AdminDetails {
	Scanner sc = new Scanner(System.in);
	CustomerDAO cuDAO = new CustomerDAOImpl();
	AdminDAO aDAO = new AdminDAOImpl();
	public void adminMainMenu() {
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("                 1)AddBus                 ");
			System.out.println("                 2)ViewAllBus             ");
			System.out.println("                 3)ViewBus                ");
			System.out.println("                 4)UpdateBus              ");
			System.out.println("                 5)DeleteBus              ");
			System.out.println("                 6)Back                   ");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				aDAO.addBus();
				break;
			case 2:
				System.out.println(aDAO.viewAllBus());
				break;
			case 3:
				System.out.println("Enter the Bus Number");
				int bno = sc.nextInt();
				aDAO.viewBus(bno);
				break;
			case 4:
				aDAO.updateBus();
				break;
			case 5:
				aDAO.deleteBus();
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
