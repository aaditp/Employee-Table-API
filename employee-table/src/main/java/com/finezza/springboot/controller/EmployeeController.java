package com.finezza.springboot.controller;

import java.util.HashMap;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.finezza.springboot.entity.Employee;
import com.finezza.springboot.service.impl.EmployeeServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("employees")
public class EmployeeController {

	private EmployeeServiceImpl emplService;

	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = emplService.addEmployee(employee);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allEmployees = emplService.getAllEmployees();
		return new ResponseEntity<>(allEmployees, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee foundEmployee = emplService.getEmployeeById(id);
		return new ResponseEntity<>(foundEmployee, HttpStatus.OK);

	}

	@GetMapping("/name")
	public ResponseEntity<List<Employee>> getEmployeeByName(@RequestBody HashMap<String, String> map) {
		List<Employee> foundEmployees = emplService.getEmployeeByName(map.get("firstName"), map.get("lastName"));
		return new ResponseEntity<>(foundEmployees, HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		Employee updatedEmployee = emplService.updateEmployee(employee);
		return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
		emplService.deleteEmployee(id);
		return new ResponseEntity<>("Succesfully Deleted", HttpStatus.OK);
	}

}