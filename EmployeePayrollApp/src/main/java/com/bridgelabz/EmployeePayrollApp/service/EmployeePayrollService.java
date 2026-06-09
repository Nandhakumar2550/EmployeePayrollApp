package com.bridgelabz.EmployeePayrollApp.service;


import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService {

    public String getEmployeeData() {
        return "Employee Payroll Service Running";
    }

    public EmployeePayrollDTO createEmployee(EmployeePayrollDTO employeeDTO) {
        return employeeDTO;
    }

    public EmployeePayrollDTO updateEmployee(EmployeePayrollDTO employeeDTO) {
        return employeeDTO;
    }
}