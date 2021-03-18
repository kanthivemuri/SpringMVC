package com.gm.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class customer {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String cname;
	@Column
	private String cemail;
	@Column
	private String cphone;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Set<address> addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public Set<address> getAddr() {
		return addr;
	}
	public void setAddr(Set<address> addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", cname=" + cname + ", cemail=" + cemail + ", cphone=" + cphone + ", addr="
				+ addr + "]";
	}
	
		

}
