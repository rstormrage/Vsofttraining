package com.salary;

public class HrDepartment extends Employee{
	private String hrName;
	private int hrNo;
	
	public HrDepartment() {
		
		
	}
	public HrDepartment(int eno, String ename, String dname, int dno, String hrName, int hrNo) {
		super(eno, ename, dname, dno);
		this.hrName = hrName;
		this.hrNo = hrNo;
		
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public int getHrNo() {
		return hrNo;
	}
	public void setHrNo(int hrNo) {
		this.hrNo = hrNo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "HrDepartment [hrName=" + hrName + ", hrNo=" + hrNo + "]";
	}

	
}
