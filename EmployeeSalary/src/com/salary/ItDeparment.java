package com.salary;

public class ItDeparment extends Employee{
	private String itName;
	private int itNo;

	public ItDeparment() {
		
	}

	public ItDeparment(int eno, String ename, String dname, int dno, String itName, int itNo) {
		super(eno, ename, dname, dno);
		this.itName = itName;
		this.itNo = itNo;
		
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public int getItNo() {
		return itNo;
	}

	public void setItNo(int itNo) {
		this.itNo = itNo;
	}

	@Override
	public String toString() {
		return super.toString() + "ItDeparment [itName=" + itName + ", itNo=" + itNo + "]";
	}

}
