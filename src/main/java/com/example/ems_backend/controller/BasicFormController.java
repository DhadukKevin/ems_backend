package com.example.ems_backend.controller;

import com.example.ems_backend.dto.BasicFormDto;
import com.example.ems_backend.entity.BasicForm;
import com.example.ems_backend.service.BasicFormService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@AllArgsConstructor
@RestController
@RequestMapping("/api/hr")
public class BasicFormController {
    private BasicFormService basicFormService;

    @PostMapping
    public ResponseEntity<BasicFormDto> createBasicForm(@RequestBody BasicFormDto basicFormDto){

        BasicFormDto savedBasicForm = basicFormService.createBasicForm(basicFormDto);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BasicFormDto>> getAllBasicForm(){
        List<BasicFormDto> basicFormList = basicFormService.getAllBasicForm();
        return ResponseEntity.ok(basicFormList);
    }
}
