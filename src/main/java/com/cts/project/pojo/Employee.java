package com.cts.project.pojo;

public class Employee {

	private String name;
    private String companyName;
     
    public Employee(String name, String companyName) {
        super();
        this.name = name;
        this.companyName = companyName;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCompanyName() {
        return companyName;
    }
 
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
