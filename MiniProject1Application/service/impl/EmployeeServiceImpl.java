package com.example.MiniProject1Application.service.impl;

import com.example.MiniProject1Application.entity.EmployeeManagement;
import com.example.MiniProject1Application.repository.EmployeeRepository;
import com.example.MiniProject1Application.service.EmployeeService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeManagement createEmployeeManagement(EmployeeManagement employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeManagement> getAllEmployeeManagements() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeManagement getEmployeeManagement(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public EmployeeManagement updateEmployeeManagement(EmployeeManagement employee) {
        EmployeeManagement emp = employeeRepository.findById(employee.getId()).get();
        emp.setEmp_Firstname(employee.getEmp_Firstname());
        emp.setEmp_Lastname(employee.getEmp_Lastname());
        emp.setEmp_EmailAddress(employee.getEmp_EmailAddress());
        return employeeRepository.save(emp);

    }

    @Override
    public void deleteEmployeeManagement(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}