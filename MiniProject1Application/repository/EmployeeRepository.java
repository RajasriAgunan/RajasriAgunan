package com.example.MiniProject1Application.repository;

import com.example.MiniProject1Application.entity.EmployeeManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeManagement,Long> {

}
