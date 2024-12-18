package com.example.ems_backend.service;

import com.example.ems_backend.dto.FamilyDetailDto;

public interface FamilyDetailService {
    FamilyDetailDto getFamilyDetailById(Long id);

    FamilyDetailDto insertData(Long id,String fatherName,String motherName,String fatherMobile,String motherMobile,String fatherOccupation,String motherOccupation,Boolean isFilled);
}
