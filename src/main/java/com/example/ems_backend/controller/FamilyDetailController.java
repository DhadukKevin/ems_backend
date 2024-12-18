package com.example.ems_backend.controller;

import com.example.ems_backend.dto.FamilyDetailDto;
import com.example.ems_backend.service.FamilyDetailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000/")
@AllArgsConstructor
@RestController
@RequestMapping("/api/hr/family-detail")
public class FamilyDetailController {
    private FamilyDetailService familyDetailService;

    @GetMapping("{id}")
    public ResponseEntity<FamilyDetailDto> getFamilyeDetailById(@PathVariable("id") Long empId){
        FamilyDetailDto familyDetailDto = familyDetailService.getFamilyDetailById(empId);

        return ResponseEntity.ok(familyDetailDto);
    }

    @PostMapping
    public ResponseEntity<FamilyDetailDto> insertData(@RequestParam Long id,@RequestParam String fatherName,@RequestParam String motherName,@RequestParam String fatherMobile,@RequestParam String motherMobile,@RequestParam String fatherOccupation,@RequestParam String motherOccupation,@RequestParam Boolean isFilled) {

        FamilyDetailDto  familyDetailDto = familyDetailService.insertData(id,fatherName,motherName,fatherMobile,motherMobile,fatherOccupation,motherOccupation,isFilled);


        return ResponseEntity.ok(familyDetailDto);
    }
}
