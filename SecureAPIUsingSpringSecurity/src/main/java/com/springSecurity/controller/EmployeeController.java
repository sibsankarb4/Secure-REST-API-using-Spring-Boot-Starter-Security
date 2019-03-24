package com.springSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurity.dao.EmployeeDAO;
import com.springSecurity.model.Employees;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController
{
    @Autowired
   private EmployeeDAO employeeDao;
     
    @GetMapping(path="/", produces = "application/json")
    public Employees getEmployees()
    {
        return employeeDao.getAllEmployees();
    }
}