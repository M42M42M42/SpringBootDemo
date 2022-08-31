package com.example.demo.service;

import com.example.demo.controller.request.EmployeeReq;
import com.example.demo.controller.responce.EmployeeResp;
import com.example.demo.entity.Employee;

public interface EmployeeService {
    EmployeeResp all();

    boolean add(EmployeeReq req);

    Employee findById(Long id);
}
