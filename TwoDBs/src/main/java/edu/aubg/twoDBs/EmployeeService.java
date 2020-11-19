package edu.aubg.twoDBs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeerepository;

	// Get list of all employees from database
    public List<Employee> listAllEmployees() {
        
		return employeerepository.findAll();
	}
	
    // Save details of a single employee in database
    public void saveEmployee(Employee employee) {
    	
    	employeerepository.save(employee);
    }
    
}

