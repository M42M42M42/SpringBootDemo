package com.example.demo.controller.request;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private Long id;
    private String name;
    private String gender;
}
