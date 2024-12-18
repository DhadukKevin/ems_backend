package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getYourName(),
                employee.getEmail(),
                employee.getPassword()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getYourName(),
                employeeDto.getEmail(),
                employeeDto.getPassword()

        );
    }
}
