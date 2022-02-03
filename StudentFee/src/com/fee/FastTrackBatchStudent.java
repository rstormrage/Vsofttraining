package com.fee;

public class FastTrackBatchStudent extends Student{
	private double discount ;
		
	public FastTrackBatchStudent(int sId, String sName, long mobileNo, String address, String courseName, int courseNo,
			double discount) {
		super(sId, sName, mobileNo, address, courseName, courseNo);
		this.discount = discount;
	}

	public FastTrackBatchStudent() {
		
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return super.toString() + " [discount=" + discount + "]";
	}
	
	public double studentFee() {
		double fee = 0;
		if(0 < courseNo && courseNo < 100) {
			fee = 50 * discount;
		}else if (100 <= courseNo && courseNo < 200) {
			fee = 60 * discount;
		}else if (200 <= courseNo && courseNo < 300) {
			fee =70 * discount;
		}
		return fee;
	}
}


