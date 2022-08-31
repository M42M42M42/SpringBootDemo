package com.example.demo.service;

import com.example.demo.controller.request.EmployeeReq;
import com.example.demo.controller.responce.EmployeeResp;
import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeServiceImpl() {
        Employee employee1 = Employee.builder().id(1L).name("ZhangSan").gender("male").build();
        Employee employee2 = Employee.builder().id(2L).name("LiSi").gender("female").build();
        employees.add(employee1);
        employees.add(employee2);
    }

    @Override
    public EmployeeResp all() {
        return EmployeeResp.builder().employees(employees).size(employees.size()).build();
    }

    @Override
    public boolean add(EmployeeReq req) {
        Employee newEmployee = Employee.builder().id(req.getId()).name(req.getName()).gender(req.getGender()).build();
        employees.add(newEmployee);
        return true;
    }

    @Override
    public Employee findById(Long id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findByGender(String gender) {
        return this.employees.stream().filter(employee -> employee.getGender().equals(gender)).collect(Collectors.toList());
    }
}
