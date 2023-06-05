package com.finezza.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, name = "first_name")
	private String firstName;
	@Column(nullable = false, name = "last_name")
	private String lastName;
	@Column(nullable = false)
	private Long salary;
	
	@Column(nullable = false, name = "email")
	private String email;
	
	@Column(nullable = false, name= "phone_number")
	private Long phoneNumber;
	
	@Column(nullable = false, name = "address")
	private String address;
	
	@Column(nullable = false, name="pincode")
	private Long pincode;
	
    @Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	@Column(nullable = false, name = "gender")
	private String gender;
	
	@Column(nullable = false, name = "marital_status")
	private String maritalStatus;

	public Employee() {
	}

	public Employee(long id, String firstName, String lastName, long salary,
			String email, Long phoneNumber, String address, Long pincode, Date dob,
			String gender, String maritalStatus) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.pincode = pincode;
		this.dob = dob;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	// Getters and Setters for id
	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// Getters and Setters for firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getters and Setters for lastName
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getters and Setters for salary
	public long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
