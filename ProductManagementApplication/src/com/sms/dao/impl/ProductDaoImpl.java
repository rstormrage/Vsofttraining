package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.bean.Product;

public class ProductDaoImpl {
	static Scanner sc = new Scanner(System.in);
	static Product addProducts[] = new Product[50];
	public static int pointer = 0;
	
	public void addProducts() {
		System.out.println("Enter how many product do you want to record.");
		int size = sc.nextInt();		
			
		for(int i = pointer; i < pointer + size; i++) {
			System.out.println("Enter the product id.");
			int pid = sc.nextInt();
			System.out.println("Enter the product name.");
			String pname = sc.next();
			System.out.println("Enter the product qulity.");
			String pqulity = sc.next();
			System.out.println("Enter the product price.");
			double pprice = sc.nextDouble();
			Product product = new Product(pid, pname, pqulity, pprice);
			addProducts[i] = product;
			System.out.println("Product " + (i + 1) + " Information Registred");
		}
		pointer =+ size;
	}
	
	public Product[] viewAllProducts() {
		return addProducts;
	}
	
	public Product viewStudent(int pid) {
		if(addProducts != null) {
			for(Product pro: addProducts) {
				if(pro.getPid() == pid) {
					return pro;
				}
			}
		}
		return null;
	}
}