
package com.g3.spc.entities;




import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Student {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	
	
	private String name;


	private String emailId;
	private String mobileNumber;
	
	@OneToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="PARENT_ID",referencedColumnName="parentId")
	private Parent parent;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




public Student(long userId, String name, String emailId, String mobileNumber, Parent parent) {
		super();
		this.studentId = userId;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.parent = parent;
	}










@JsonBackReference
public Parent getParent() {
	return parent;
}



public void setParent(Parent parent) {
	this.parent = parent;
}










public long getUserId() {
	return studentId;
}




public void setUserId(long userId) {
	this.studentId = userId;
}





public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getEmailId() {
	return emailId;
}




public void setEmailId(String emailId) {
	this.emailId = emailId;
}




public String getMobileNumber() {
	return mobileNumber;
}




public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}




@Override
public String toString() {
	return "Student [userId=" + studentId + ", name=" + name + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber
			+ ", parent=" + parent + "]";
}


}
