package com.fee;

public class Student {
	private int sId;
	private String sName;
	private long MobileNo;
	private String address;
	private String courseName;
	protected int courseNo;
	
	
	public Student(int sId, String sName, long mobileNo, String address, String courseName, int courseNo) {
		super();
		this.sId = sId;
		this.sName = sName;
		MobileNo = mobileNo;
		this.address = address;
		this.courseName = courseName;
		this.courseNo = courseNo;
	}
	public Student() {
		
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", MobileNo=" + MobileNo + ", address=" + address
				+ ", courseName=" + courseName + ", courseNo=" + courseNo + "]";
	}
	
	public double studentFee(){
		double fee = 0;
		if(0 < courseNo && courseNo < 100) {
			fee = 50;
		}else if (100 <= courseNo && courseNo < 200) {
			fee = 60;
		}else if (200 <= courseNo && courseNo < 300) {
			fee =70;
		}
		return fee;
	}
}
