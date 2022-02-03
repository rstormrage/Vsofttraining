package com.fee;

public class WeekendBatchStudent extends Student{
	private int week;
	
	public WeekendBatchStudent() {
		
	}

	public WeekendBatchStudent(int sId, String sName, long mobileNo, String address, String courseName, int courseNo, int week) {
		super(sId, sName, mobileNo, address, courseName, courseNo);
		this.week = week;
		
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	@Override
	public String toString() {
		return super.toString() + " [week=" + week + "]";
	}
	
	public double studentFee() {
		double fee = 0;
		if(0 < courseNo && courseNo < 100) {
			fee = 50 * week;
		}else if (100 <= courseNo && courseNo < 200) {
			fee = 60 * week;
		}else if (200 <= courseNo && courseNo < 300) {
			fee =70 * week;
		}
		return fee;
	}

}
