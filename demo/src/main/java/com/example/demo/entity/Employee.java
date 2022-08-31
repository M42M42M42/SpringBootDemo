package com.example.demo.entity;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private long id;
    private String name;
    private String gender;
}
