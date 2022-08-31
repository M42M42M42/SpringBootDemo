package com.example.demo.controller;

import com.example.demo.controller.request.EmployeeReq;
import com.example.demo.controller.responce.EmployeeResp;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class DemoController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public EmployeeResp all() {
        return employeeService.all();
    }

    @PostMapping("/addition")
    @ResponseStatus(value = HttpStatus.CREATED)
    public boolean add(@RequestBody EmployeeReq req) {
        return employeeService.add(req);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id") Long employeeId) {
        return employeeService.findById(employeeId);
    }

    @GetMapping
    public List<Employee> getEmployeesByGender(@RequestParam(value = "gender") String gender) {
        return employeeService.findByGender(gender);
    }
}
