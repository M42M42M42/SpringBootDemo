package com.example.demo.service;

import com.example.demo.controller.request.EmployeeRequest;
import com.example.demo.controller.responce.EmployeeResponse;
import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse all();

    boolean add(EmployeeRequest req);

    Employee findById(Long id);

    List<Employee> findByGender(String gender);
}
