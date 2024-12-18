package com.example.ems_backend.service;

import com.example.ems_backend.dto.EducationDetailDto;

public interface EducationDetailService {

    EducationDetailDto getEducationdetailById(Long id);

    EducationDetailDto insertData(
            Long id,
            Double sscPercentage,
            Double hscPercentage,
            Long sscPassingYear,
            Long hscPassingYear,
            String collegeName,
            String degree,
            String passingYear,
            Double cgpa,
            Boolean isFilled
    );
}
