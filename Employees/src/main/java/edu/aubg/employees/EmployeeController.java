package edu.aubg.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping(value="/listEmployees",
			method=RequestMethod.GET)
	/* Show list of employees */
	
	public String listEmployees(Model model) {
		
		/* Get list of employees from database*/
		List<Employee> employeeList = employeeservice.findEmployee();
		model.addAttribute("employees", employeeList);
		
		return "showListEmployees";
	}
	
	@RequestMapping(value="/addEmployee",
			method=RequestMethod.GET)
	/* Show add new employee form */
	public String addEmployee() {
		
		return "showAddEmployeeForm";
	}
	
	@RequestMapping(value="/addEmployeeSubmit",
			method=RequestMethod.POST)
	/* Add submitted new employee details to database, and then 
	 * redirect to listEmployees */
	public String addEmployeeSubmit(Employee employee) {
		
		employeeservice.save(employee);
		
		return "redirect:/employee/listEmployees";
	}
	
	 @RequestMapping(value="/editEmployee/{id}", method=RequestMethod.GET)

    /* Send update employee details form */

    public String editEmployee(@PathVariable("id") long id, Model model) {
    	
    	/* Get details of employee identified by id from database */

      //Two statements need to be added here.
		 
		 Employee employee = employeeservice.get(id);
			
			model.addAttribute("employee", employee);
        
        return "showEmployeeEditForm";
    } 

	@RequestMapping(value="/editEmployeeSubmit", method=RequestMethod.POST)

    /* Update database with submitted employee details, and then redirect to listEmployees */

   public String editEmployeeSubmit(Employee employee) {
		
		employeeservice.save(employee);
		return "redirect:/employee/listEmployees";
		
    	// Two statements needs to be added here
    		    
    } 
   
	
	@RequestMapping(value="/deleteEmployee/{id}", method=RequestMethod.GET)

    /* Delete from database details of employee identified by id, and then redirect to listEmployees */

    public String deleteEmployee(@PathVariable("id") long id) {

    	// Two statements needs to be added here
		employeeservice.delete(id);
		return "redirect:/employee/listEmployees";
    	
    }
	
	@RequestMapping(value="/detailsEmployee/{id}", method=RequestMethod.GET)
	
	public String detailsEmployee(@PathVariable("id") long id, Model model) {
		
		/* Get list of employees from database*/
		Employee employee = employeeservice.get(id);
		
		model.addAttribute("employee", employee);
		
		
		return "showEmployeeDetails";
	}


	

}
