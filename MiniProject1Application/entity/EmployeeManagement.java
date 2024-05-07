package com.example.MiniProject1Application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="employee_management")
public class EmployeeManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private  String Emp_Firstname;
    @Column(nullable = false)
    private  String Emp_Lastname;
    @Column(nullable = false,unique = true)
    private  String Emp_EmailAddress;

}
