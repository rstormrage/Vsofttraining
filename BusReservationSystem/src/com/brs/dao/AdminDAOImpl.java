package com.brs.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.brs.pojo.Bus;



public class AdminDAOImpl implements AdminDAO {
	
	Scanner sc = new Scanner(System.in);
	public static ArrayList<Bus> blist = new ArrayList<>();

	@Override
	public void addBus() {
		// TODO Auto-generated method stub
		System.out.println("How many Bus do you want to add");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Bus ID");
			int bno = sc.nextInt();
			System.out.println("Enter Bus From");
			String bfrom = sc.next();
			System.out.println("Enter Bus To");
			String bto = sc.next();
			System.out.println("Enter Bus Time");
			String btime = sc.next();
			Bus bs = new Bus(bno, bfrom, bto, btime);
			blist.add(bs);
			System.out.println("Added successfully");
		}

	}

	@Override
	public ArrayList<Bus> viewAllBus() {
		// TODO Auto-generated method stub
		return blist;
	}

	@Override
	public Bus viewBus(int bno) {
		// TODO Auto-generated method stub
		for(Bus bs: blist) {
			if(bs.getBno() == bno) {
				return bs;
			}
		}
		return null;
	}

	@Override
	public void updateBus() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Bus Number you want to update");
		int bno = sc.nextInt();		
		int index = 0;
		for(Bus bs: blist) {
			if(bs.getBno() == bno) {
				index = blist.indexOf(bs);
				System.out.println("Enter Bus ID");
				bno = sc.nextInt();
				System.out.println("Enter Bus From");
				String bfrom = sc.next();
				System.out.println("Enter Bus To");
				String bto = sc.next();
				System.out.println("Enter Bus Time");
				String btime = sc.next();
				Bus newbs = new Bus(bno, bfrom, bto, btime);

				System.out.println(newbs);
				blist.set(index, newbs);
				System.out.println("Update successfully");
			}else {
				System.out.println("Bus does not exist");
			}
		}
	}

	@Override
	public void deleteBus() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Bus Number you want to delete");
		int bno = sc.nextInt();		
		int index = 0;
		for(Bus bs: blist) {
			if(bs.getBno() == bno) {
				index = blist.indexOf(bs);
				System.out.println(blist.get(index));
				blist.remove(index);
				System.out.println("Deleted successfully");
			}else {
				System.out.println("Bus does not exist");
			}
		}

	}

}
