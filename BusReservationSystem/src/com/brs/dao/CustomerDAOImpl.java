package com.brs.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.brs.pojo.Bus;
import com.brs.pojo.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	Scanner sc = new Scanner(System.in);
	//static public ArrayList<Customer> clist = new ArrayList<>();
	static Customer cus = new Customer();
	//Bus bs;

	@Override
	public ArrayList<Bus> viewAllBus() {
		// TODO Auto-generated method stub
		return AdminDAOImpl.blist;
	}
	
	@Override
	public void yourBus() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");
		System.out.println(cus.getBookedBus());
		System.out.println("------------------------------------------");
	}
	
	@Override
	public void bookBus() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Bus Number you want to book");
		int bno = sc.nextInt();
		for(Bus bs: AdminDAOImpl.blist) {
			if(bs.getBno() == bno) {
				//this.bs = bs;
				//Customer cus1 = new Customer(bs);
				cus.setBookedBus(bs);
				//System.out.println("Booked successfully");
				
			//}else {
			//	System.out.println("Bus does not exist");
				
			}
		}
		if(cus.getBookedBus()!= null) {
			System.out.println("Booked successfully");
		}else {
			System.out.println("Bus does not exist");
		}

	}
	
	@Override
	public void cancelBus() {
		// TODO Auto-generated method stub
		cus.setBookedBus(null);
		System.out.println("Your bus was canceled");
		
	}

}
