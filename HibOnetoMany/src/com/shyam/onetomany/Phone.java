package com.shyam.onetomany;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Phone implements Serializable {
	
	private int phone_id;
	private String phone_name;
	private String phone_model;
	
	public Phone(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.phone_name=string;
		this.phone_model=string2;
	}
	public int getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}
	public String getPhone_name() {
		return phone_name;
	}
	public void setPhone_name(String phone_name) {
		this.phone_name = phone_name;
	}
	public String getPhone_model() {
		return phone_model;
	}
	public void setPhone_model(String phone_model) {
		this.phone_model = phone_model;
	}
	
	

}
