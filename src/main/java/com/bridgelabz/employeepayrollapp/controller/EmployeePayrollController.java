package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService employeePayrollService;

    @GetMapping("/employee")
    public String getEmployeePayrollData() {
        return employeePayrollService.getEmployeePayrollData();
    }
}