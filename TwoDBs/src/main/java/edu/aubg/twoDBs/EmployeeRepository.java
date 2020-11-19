package edu.aubg.twoDBs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

    // An empty class! JpaRepository methods are used without modification!

}

