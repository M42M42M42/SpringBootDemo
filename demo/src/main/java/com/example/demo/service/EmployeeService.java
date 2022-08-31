package com.example.demo.service;

import com.example.demo.controller.request.EmployeeReq;
import com.example.demo.controller.responce.EmployeeResp;
import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeResp all();

    boolean add(EmployeeReq req);

    Employee findById(Long id);

    List<Employee> findByGender(String gender);
}
