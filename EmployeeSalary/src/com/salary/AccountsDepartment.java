package com.salary;

public class AccountsDepartment extends Employee{
	private String accountName;
	private int accountNo;
	
	public AccountsDepartment() {
		
	}
	public AccountsDepartment(int eno, String ename, String dname, int dno) {
		super(eno, ename, dname, dno);
		this.accountName = accountName;
		this.accountNo = accountNo;
		
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "AccountsDepartment [accountName=" + accountName + ", accountNo=" + accountNo + "]";
	}
	
}
