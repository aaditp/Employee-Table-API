package com.finezza.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.finezza.springboot.entity.Employee;
import com.finezza.springboot.repository.EmployeeRepository;
import com.finezza.springboot.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> empl = employeeRepo.findById(id);
		return empl.get();
	}

	@Override
	public List<Employee> getEmployeeByName(String fName, String lName) {
		return employeeRepo.getEmployeeByName(fName, lName);

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = employeeRepo.findById(employee.getId()).get();
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setPhoneNumber(employee.getPhoneNumber());
		existingEmployee.setAddress(employee.getAddress());
		existingEmployee.setPincode(employee.getPincode());
		existingEmployee.setDob(employee.getDob());
		existingEmployee.setGender(employee.getGender());
		existingEmployee.setMaritalStatus(employee.getMaritalStatus());
		
		
		Employee updatedEmployee = employeeRepo.save(existingEmployee);
		return updatedEmployee;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}
}
