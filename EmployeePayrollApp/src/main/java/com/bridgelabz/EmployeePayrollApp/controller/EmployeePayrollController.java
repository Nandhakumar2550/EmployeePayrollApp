package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollController {

    @GetMapping
    public String getEmployee() {
        return "Get Employee Payroll Data";
    }

    @PostMapping
    public String addEmployee(@RequestBody EmployeePayrollDTO dto) {
        return "Added Employee : " + dto.getName() +
                " Salary : " + dto.getSalary();
    }

    @PutMapping
    public String updateEmployee(@RequestBody EmployeePayrollDTO dto) {
        return "Updated Employee : " + dto.getName() +
                " Salary : " + dto.getSalary();
    }

    @DeleteMapping("/{name}")
    public String deleteEmployee(@PathVariable String name) {
        return "Deleted Employee : " + name;
    }
}