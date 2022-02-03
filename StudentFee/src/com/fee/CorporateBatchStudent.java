package com.fee;

public class CorporateBatchStudent extends Student {
	private double discount;

	public CorporateBatchStudent(int sId, String sName, long mobileNo, String address, String courseName, int courseNo,
			double discount) {
		super(sId, sName, mobileNo, address, courseName, courseNo);
		this.discount = discount;
	}
	
	public CorporateBatchStudent() {
		
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return super.toString() +  " [discount=" + discount + "]";
	}
	
	
}
