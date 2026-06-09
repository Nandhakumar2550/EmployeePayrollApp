package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService employeePayrollService;

    @GetMapping
    public List<EmployeePayrollDTO> getEmployee() {
        return employeePayrollService.getEmployeeData();
    }

    @PostMapping
    public EmployeePayrollDTO addEmployee(
            @RequestBody EmployeePayrollDTO employeeDTO) {

        return employeePayrollService.createEmployee(employeeDTO);
    }

    @PutMapping
    public EmployeePayrollDTO updateEmployee(
            @RequestBody EmployeePayrollDTO employeeDTO) {

        return employeePayrollService.updateEmployee(employeeDTO);
    }

    @DeleteMapping("/{name}")
    public String deleteEmployee(@PathVariable String name) {
        return employeePayrollService.deleteEmployee(name);
    }
}