package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gripinfo {
	@Id
	private int idGripinfo;
	private String name;
	private String address;
	private String email;
	private String mobile;
	public int getIdGripinfo() {
		return idGripinfo;
	}
	public void setIdGripinfo(int idGripinfo) {
		this.idGripinfo = idGripinfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Gripinfo [idGripinfo=" + idGripinfo + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}

}
