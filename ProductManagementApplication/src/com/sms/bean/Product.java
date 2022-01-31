package com.sms.bean;

public class Product {
	private int pid;
	private String pname;
	private String pqulity;
	private double pprice;
	
	public Product(int pid, String pname, String pqulity, double pprice) {
		this.pid = pid;
		this.pname = pname;
		this.pqulity = pqulity;
		this.pprice = pprice;
		
	}
	
	public Product() {
	
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPqulity() {
		return pqulity;
	}

	public void setPqulity(String pqulity) {
		this.pqulity = pqulity;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	
	public String toString() {
		return pid + "\t" + pname + "\t" + pqulity + "\t" + pprice;
	}
	

}
