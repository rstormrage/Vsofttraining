package com.salary;

public class Employee {
	private int eno;
	private String ename;
	private String dname;
	protected int dno;
	
	public Employee(int eno, String ename, String dname, int dno) {
		this.eno = eno;
		this.ename = ename;
		this.dname = dname;
		this.dno = dno;
	}

	public Employee() {
		
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dname=" + dname + ", dno=" + dno + "]";
	}
	
	public double calculateSalary() {
		double fee = 0;
		if(0 < dno && dno < 10) {
			fee = 500;
		}else if (10 <= dno && dno < 20) {
			fee = 600;
		}else if (20 <= dno && dno < 30) {
			fee = 700;
		}
		return fee;
	}

}
