package edu.aubg.twoDBs;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
@SecondaryTable(name = "EMPLOYEE_DETAILS")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
// First table properties - EMPLOYEES
    
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "First_Name")
    private String firstName;
    
    @Column(name = "Last_Name")
    private String lastName;
    
	public Long getId() {
        return id;
    }
	
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
	
	public String getLastName() {
        return lastName;
    }
	
	public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
// Second table properties - EMPLOYEE_DETAILS
	
    @Column(name = "Title", table = "EMPLOYEE_DETAILS")
    private String title;
    
    @Column(name = "Salary", table = "EMPLOYEE_DETAILS")
    private long salary;
    
    @Column(name = "Location", table = "EMPLOYEE_DETAILS")
    private String location;
    
	
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public long getSalary() {
        return salary;
    }
    
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }    

}
