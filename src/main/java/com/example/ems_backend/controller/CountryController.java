package com.example.ems_backend.controller;

import com.example.ems_backend.dto.CountryDto;
import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.entity.Country;
import com.example.ems_backend.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees/country")
public class CountryController {
    private CountryService countryService;
//    @GetMapping
//    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
//        List<EmployeeDto> employees = employeeService.getAllEmployee();
//
//        return ResponseEntity.ok(employees);
//    }

    @GetMapping("{pageNo}")
    public  ResponseEntity<Page<Country>> getCountryPage(@PathVariable("pageNo") int PageNo){
        Page<Country> country = countryService.getCountryInPage(PageNo);
        return ResponseEntity.ok(country);
    }

    @GetMapping
    public  ResponseEntity<List<Country>> getAllCountry(){

        List<Country> country = countryService.getAllCountry();

        return ResponseEntity.ok(country);
    }
}
