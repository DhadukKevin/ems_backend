package com.example.ems_backend.controller;

import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.dto.TextDto;
import com.example.ems_backend.service.EmployeeService;
import com.example.ems_backend.service.TextService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;

@CrossOrigin(origins = "http://localhost:3000/")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees/texts")
@Slf4j
public class TextController {
    private TextService textService;

    @PostMapping("{id}")
    public ResponseEntity<TextDto> createText(@Param("id") Long employeeId,@RequestBody String textData){
        TextDto savedText = textService.updateTextById(employeeId,textData);
        return new ResponseEntity<>(savedText, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TextDto> getTextById(@PathVariable("id") Long emp_id){
        TextDto text = textService.getTextById(emp_id);
        return ResponseEntity.ok(text);
    }

    @PutMapping("{id}")
    public ResponseEntity<TextDto> updateTextByEmployeeId(@PathVariable("id") Long emp_id,
                                                              @RequestBody String textData){
        //log.info("employee Id : "+emp_id+" , text data : "+textData);
        TextDto textDto = textService.updateTextById(emp_id,textData);

        return ResponseEntity.ok(textDto);
    }
}
