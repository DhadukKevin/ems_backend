package com.example.ems_backend.controller;

import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Use this CrossOrigin because the spring boot is running on port 8080 and
//React is running on 3000
//and that's why we can not get the data on front end
//to resolve this issue use CrossOrigin and pass the origin as your React app link
//just provide a "*" to access all the origins
@CrossOrigin(origins = "http://localhost:3000/")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello World";
//    }
    // Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee =  employeeService.createEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto =  employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    //Build Get All Employee REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployee();

        return ResponseEntity.ok(employees);
    }

    //Build Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,
                                                      @RequestBody EmployeeDto updatedEmployee){

        EmployeeDto employeeDto = employeeService.updateEmployee(employeeId,updatedEmployee);

        return ResponseEntity.ok(employeeDto);
    }

    //Build delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeID){
        employeeService.deleteEmployee(employeeID);
        return ResponseEntity.ok("Employee Deleted Successfully!.");
    }

    @GetMapping("/login")
    public ResponseEntity<EmployeeDto> login(@RequestParam String employeeEmail,@RequestParam String Password){
        EmployeeDto d = employeeService.login(employeeEmail,Password);
        return ResponseEntity.ok(d);
    }

    @GetMapping("/checkEmail")
    public ResponseEntity<Boolean> checkMail(@RequestParam String employeeEmail){
        boolean flag = employeeService.checkEmail(employeeEmail);
        return ResponseEntity.ok(flag);
    }
}
