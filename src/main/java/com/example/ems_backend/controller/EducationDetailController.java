package com.example.ems_backend.controller;

import com.example.ems_backend.dto.EducationDetailDto;
import com.example.ems_backend.service.EducationDetailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/hr/education-detail")
public class EducationDetailController {
    private EducationDetailService educationDetailService;

    @GetMapping("{id}")
    public ResponseEntity<EducationDetailDto> getEducationDetailById(@PathVariable("id") Long id){
        EducationDetailDto educationDetailDto = educationDetailService.getEducationdetailById(id);

        return ResponseEntity.ok(educationDetailDto);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<EducationDetailDto> insertData(@RequestParam Long id, @RequestParam Double sscPercentage, @RequestParam Double hscPercentage, @RequestParam Long sscPassingYear, @RequestParam Long hscPassingYear, @RequestParam String collegeName, @RequestParam String degree, @RequestParam String passingYear, @RequestParam Double cgpa, @RequestParam Boolean isFilled){
            EducationDetailDto educationDetailDto = educationDetailService.insertData(id, sscPercentage, hscPercentage, sscPassingYear, hscPassingYear, collegeName, degree, passingYear, cgpa, isFilled);
            return ResponseEntity.ok(educationDetailDto);
    }
}
