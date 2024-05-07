package com.example.MiniProject1Application.controller;

import com.example.MiniProject1Application.entity.EmployeeManagement;
import com.example.MiniProject1Application.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/employee_management")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeManagement> createEmployeeManagement
            (@RequestBody EmployeeManagement employee) {
        EmployeeManagement saveEmp = employeeService.createEmployeeManagement(employee);
        return new ResponseEntity<>(saveEmp, HttpStatus.CREATED);
    }
  @GetMapping
  public ResponseEntity<List<EmployeeManagement>> getAllEmployeeManagements() {
      List<EmployeeManagement> employees = employeeService.getAllEmployeeManagements();
      return new ResponseEntity<>(employees, HttpStatus.OK);
  }
@GetMapping("{id}")
    public ResponseEntity<EmployeeManagement> getEmployeeManagement(@PathVariable("id") Long id) {
    EmployeeManagement employeeID= employeeService.getEmployeeManagement(id);
    return new ResponseEntity<>(employeeID, HttpStatus.OK);
}
@PutMapping("id")
    public ResponseEntity<EmployeeManagement> updateEmployeeManagement
        (@PathVariable("id") Long id,@RequestBody EmployeeManagement employee){
        employee.setId(id);
        EmployeeManagement updateEmp=employeeService.updateEmployeeManagement(employee);
        return new ResponseEntity<>(updateEmp,HttpStatus.OK);
}
@DeleteMapping("{id}")
public ResponseEntity<String> deleteEmployeeManagement(@PathVariable("id") Long id){
        employeeService.deleteEmployeeManagement(id);
        return new ResponseEntity<String>("EmpDetails Deleted Successfully",HttpStatus.OK);
}
}
