package com.example.ems_backend.dto;

import com.example.ems_backend.entity.BasicForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamilyDetailDto {
    private Long f_id;
    private String fatherName;
    private String motherName;
    private String fatherOccupation;
    private String motherOccupation;
    private String fatherMobile;
    private String motherMobile;
    private Boolean isFilled;
    private BasicForm basicForm;
}
