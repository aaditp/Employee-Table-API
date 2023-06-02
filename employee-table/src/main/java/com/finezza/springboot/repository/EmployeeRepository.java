package com.finezza.springboot.repository;

import com.finezza.springboot.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("SELECT e FROM Employee e WHERE e.firstName LIKE %:fName% and e.lastName LIKE %:lName%")
	List<Employee> getEmployeeByName(@Param("fName") String fName, @Param("lName") String lName);

}
