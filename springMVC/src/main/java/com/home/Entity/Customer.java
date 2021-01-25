package com.home.Entity;

public class Customer {
	
	public int custid;
	public String first_name;
	public String last_name;
	public String emailadd;
	public int phone;
	public String password;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
	public String getEmailadd() {
		return emailadd;
	}
	public void setEmailadd(String emailadd) {
		this.emailadd = emailadd;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", first_name=" + first_name + ", last_name=" + last_name + ", emailadd="
				+ emailadd + ", phone=" + phone + ", password=" + password + "]";
	}
	

}
