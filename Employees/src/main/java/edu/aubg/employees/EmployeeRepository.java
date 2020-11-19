package edu.aubg.employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



/* This interface extends the JpaRepository interface which provides all the basic CRUD methods for the Employee table. */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("select s from EMPLOYEES s where NOT s.location = 'Sofia'") List<Employee> findEmployee();
}

