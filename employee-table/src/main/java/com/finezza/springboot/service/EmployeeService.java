package com.finezza.springboot.service;

import java.util.List;

import com.finezza.springboot.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	List<Employee> getEmployeeByName(String firstName, String lastName);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Long id);

}
