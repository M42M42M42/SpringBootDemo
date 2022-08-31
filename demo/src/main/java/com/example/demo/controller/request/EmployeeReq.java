package com.example.demo.controller.request;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeReq {
    private Long id;
    private String name;
    private String gender;
}
