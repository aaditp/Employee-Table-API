package com.finezza.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, name = "first_name")
	private String firstName;
	@Column(nullable = false, name = "last_name")
	private String lastName;
	@Column(nullable = false)
	private long salary;

	public Employee() {
	}

	public Employee(long id, String firstName, String lastName, long salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Getters and Setters for id
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
