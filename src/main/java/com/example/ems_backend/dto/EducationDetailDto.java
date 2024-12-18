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
public class EducationDetailDto {
    private Long edu_id;
    private Double sscPercentage;
    private Double hscPercentage;
    private Long sscPassingYear;
    private Long hscPassingYear;
    private String collegeName;
    private String degree;
    private String passingYear;
    private Double cgpa;
    private Boolean isFilled;
    private BasicForm basicForm;
}
