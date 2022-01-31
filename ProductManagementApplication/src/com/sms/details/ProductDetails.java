package com.sms.details;

import java.util.Scanner;

import com.sms.bean.Product;
import com.sms.client.ProductClient;
import com.sms.dao.impl.ProductDaoImpl;

public class ProductDetails {
	Scanner sc = new Scanner(System.in);
	ProductDaoImpl daoImpl =new ProductDaoImpl();
	
	public void proMenu() {
		while(true){
			System.out.println("------------------------------------------");
			System.out.println("              1)AddProducts               ");
			System.out.println("              2)ViewAllProducts           ");
			System.out.println("              3)ViewProduct               ");
			System.out.println("              4)Back                      ");
			System.out.println("------------------------------------------");
			
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				daoImpl.addProducts();
				proMenu();
				break;
			case 2:
				Product viewAllProducts[] = daoImpl.viewAllProducts();
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Product ID \t Product Name \t Product Qulity \t Product Price");	
				System.out.println("-------------------------------------------------------------------");
				if(viewAllProducts != null) {
					for(Product pro: viewAllProducts) {
						if(pro != null){
							System.out.println(pro.toString());
						}else break;
					}
				}else {
					System.out.println("Product information is not available");
				}
				proMenu();
				break;
			case 3:
				System.out.println("Enter the product number");
				int stuid = sc.nextInt();
				if (stuid > ProductDaoImpl.pointer) {
					System.out.println("Product record is not available");
					break;
				}
				Product pro = daoImpl.viewStudent(stuid);
				System.out.println("Product ID \t Product Name \t Product Qulity \t Product Price");
				if(pro != null) {
					System.out.println(pro.toString());
				}else {
					System.out.println("Product record is not available");
				}
				break;
			case 4:
				ProductClient.main(null);
				break;				
			default:
				System.out.println("Choose 1 to 4");	
			}
		}
	}
}
