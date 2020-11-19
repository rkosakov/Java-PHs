package edu.aubg.twoDBs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

   @Autowired
    private EmployeeService employeeservice; 
   
    @RequestMapping(value="/listEmployees", method=RequestMethod.GET)
    /* Show list of employees */
    public String listEmployees(Model model) {
    	
    	/* Get list of employees from database*/
    	List<Employee> employeeList = employeeservice.listAllEmployees();

        model.addAttribute("employees", employeeList);

        return "showListEmployees";
    }

    
    @RequestMapping(value="/addEmployee", method=RequestMethod.GET)
    /* Show add new employee form */
    public String addEmployee() {
    	
        return "showAddEmployeeForm";
    }


    @RequestMapping(value="/addEmployeeSubmit", method=RequestMethod.POST)
    /* Add submitted new employee details to database, and then redirect to listEmployees */
    public String addEmployeeSubmit(Employee employee) {

    	// Save employee details in database
        employeeservice.saveEmployee(employee);

        return "redirect:/employee/listEmployees";
    }

}


