package com.sms.bean;

public class User {
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String userName;
	private String passWord;
	
	public User(int id, String first_name, String last_name, String email, String userName, String passWord) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
	public User(String userName, String passWord) {
		
		this.userName = userName;
		this.passWord = passWord;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if(userName == null) {
			if(other.userName != null)
				return false;
		}else if(!userName.equals(other.userName)) {
			return false;
		}
		return true;
	}

}
