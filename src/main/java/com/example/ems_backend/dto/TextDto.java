package com.example.ems_backend.dto;

import com.example.ems_backend.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TextDto {
    private Long id;
    private String textData;
    private Employee employee;


}
