package com.example.ems_backend.controller;

import com.example.ems_backend.dto.PersonalDetailDto;
import com.example.ems_backend.service.PersonalDetailSevice;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@AllArgsConstructor
@RestController
@RequestMapping("/api/hr/personal-detail")
public class PersonalDetailController {
    private PersonalDetailSevice personalDetailSevice;

    @GetMapping
    public ResponseEntity<List<PersonalDetailDto>> getAllPersonalDetail(){
        List<PersonalDetailDto> personalDetailList = personalDetailSevice.getPersonalDetail();

        return ResponseEntity.ok(personalDetailList);
    }

    @GetMapping("{id}")
    public ResponseEntity<PersonalDetailDto> getByEmpId(@PathVariable("id") Long empId){
        PersonalDetailDto personalDetailDto = personalDetailSevice.getByEmpId(empId);

        return ResponseEntity.ok(personalDetailDto);
    }

    @PostMapping
    public ResponseEntity<PersonalDetailDto> savePersonalDetail(@RequestParam Long id,@RequestParam String Address,@RequestParam String City,@RequestParam String dob,@RequestParam String Gender,@RequestParam Boolean isFilled) throws ParseException {
        PersonalDetailDto personalDetailDto = personalDetailSevice.insertData(id,Address,City,dob,Gender,isFilled);

        return ResponseEntity.ok(personalDetailDto);
    }
}
