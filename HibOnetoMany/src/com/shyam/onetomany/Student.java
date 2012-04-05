package com.shyam.onetomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Student implements Serializable {

 private int student_id;
 private String student_name;
 private Set<Phone> phone = new HashSet<Phone>(0);
 
 
public Student(String string, Set<Phone> phoneNumbers) {
	// TODO Auto-generated constructor stub
	this.student_name = string;
	this.phone =phoneNumbers;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public Set<Phone> getPhone() {
	return phone;
}
public void setPhone(Set<Phone> phone) {
	this.phone = phone;
}
 
 
 
 
}
