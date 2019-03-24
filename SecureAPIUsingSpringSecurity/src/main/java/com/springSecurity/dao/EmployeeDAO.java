package com.springSecurity.dao;

import org.springframework.stereotype.Repository;

import com.springSecurity.model.Employee;
import com.springSecurity.model.Employees;


@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Sibsankar ", "Bera", "sibsankarb4@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Adityasankar", "Bera", "adi@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Rabindranath", "Bera", "rabindranath@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
