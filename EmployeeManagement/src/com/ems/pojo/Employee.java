package com.ems.pojo;

public class Employee {
	private int eno;
	private String ename;
	private String eadd;
	private long ephone;
	private String email;
	
	public Employee(int eno, String ename, String eadd, long ephone, String email) {
		
		this.eno = eno;
		this.ename = ename;
		this.eadd = eadd;
		this.ephone = ephone;
		this.email = email;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", ephone=" + ephone + ", email="
				+ email + "]" + "\n";
	}
	

}
