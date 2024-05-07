package com.example.MiniProject1Application.service;

import com.example.MiniProject1Application.entity.EmployeeManagement;

import java.util.List;

public interface EmployeeService {
     EmployeeManagement createEmployeeManagement(EmployeeManagement employee);
     List<EmployeeManagement> getAllEmployeeManagements();
     EmployeeManagement getEmployeeManagement(Long employeeId);
     EmployeeManagement updateEmployeeManagement(EmployeeManagement employee);
     void deleteEmployeeManagement(Long employeeId);
}
