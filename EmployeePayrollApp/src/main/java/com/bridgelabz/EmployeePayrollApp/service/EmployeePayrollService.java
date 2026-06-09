package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {

    private final List<EmployeePayrollData> employeeList = new ArrayList<>();

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeList;
    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto) {

        EmployeePayrollData employee =
                new EmployeePayrollData(
                        employeeList.size() + 1,
                        dto.getName(),
                        dto.getSalary()
                );

        employeeList.add(employee);

        return employee;
    }
}