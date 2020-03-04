package com.cts.project.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.pojo.Employee;

@RestController
public class EmployeeController {
	
	private static Map<String, List<Employee>> companyDB = new HashMap<String, List<Employee>>();
	 
    static {
    	
        companyDB = new HashMap<String, List<Employee>>();
 
        List<Employee> lst = new ArrayList<Employee>();
        Employee com = new Employee("Abhilash", "Google");
        lst.add(com);
        com = new Employee("Chandu", "TechMahindra");
        lst.add(com);
 
        companyDB.put("Microsoft", lst);
 
        lst = new ArrayList<Employee>();
        com = new Employee("Shiva", "Cognizant");
        lst.add(com);
        com = new Employee("Srujan", "Wipro");
        lst.add(com);
 
        companyDB.put("Capgemini", lst);
 
    }
 
    @RequestMapping(value = "/getEmployeeDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public List<Employee> getEmployees(@PathVariable String schoolname) {
        System.out.println("Getting Employee details for " + schoolname);
 
        List<Employee> employeeList = companyDB.get(schoolname);
        if (employeeList == null) {
        	employeeList = new ArrayList<Employee>();
        	Employee com = new Employee("Not Found", "N/A");
            employeeList.add(com);
        }
        return employeeList;
    }
}