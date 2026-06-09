package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {

    private final List<EmployeePayrollDTO> employeeList = new ArrayList<>();

    public List<EmployeePayrollDTO> getEmployeeData() {
        return employeeList;
    }

    public EmployeePayrollDTO createEmployee(EmployeePayrollDTO employeeDTO) {
        employeeList.add(employeeDTO);
        return employeeDTO;
    }

    public EmployeePayrollDTO updateEmployee(EmployeePayrollDTO employeeDTO) {
        for (EmployeePayrollDTO employee : employeeList) {
            if (employee.getName().equals(employeeDTO.getName())) {
                employee.setSalary(employeeDTO.getSalary());
                return employee;
            }
        }
        return null;
    }

    public String deleteEmployee(String name) {
        employeeList.removeIf(emp -> emp.getName().equals(name));
        return "Deleted Employee : " + name;
    }
}