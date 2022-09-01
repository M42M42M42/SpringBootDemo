package com.example.demo.controller.responce;

import com.example.demo.entity.Employee;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private List<Employee> employees;
    private int size;
}
