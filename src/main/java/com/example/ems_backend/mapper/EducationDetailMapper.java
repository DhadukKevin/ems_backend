package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.EducationDetailDto;
import com.example.ems_backend.entity.EducationDetail;

public class EducationDetailMapper {

    public static EducationDetail mapToEducationDetail(EducationDetailDto educationDetailDto){
        return new EducationDetail(
                educationDetailDto.getEdu_id(),
                educationDetailDto.getSscPercentage(),
                educationDetailDto.getHscPercentage(),
                educationDetailDto.getSscPassingYear(),
                educationDetailDto.getHscPassingYear(),
                educationDetailDto.getCollegeName(),
                educationDetailDto.getDegree(),
                educationDetailDto.getPassingYear(),
                educationDetailDto.getCgpa(),
                educationDetailDto.getIsFilled(),
                educationDetailDto.getBasicForm()
        );
    }

    public static EducationDetailDto mapToEducationDetailDto(EducationDetail educationDetail){
        return new EducationDetailDto(
                educationDetail.getEdu_id(),
                educationDetail.getSscPercentage(),
                educationDetail.getHscPercentage(),
                educationDetail.getSscPassingYear(),
                educationDetail.getHscPassingYear(),
                educationDetail.getCollegeName(),
                educationDetail.getDegree(),
                educationDetail.getPassingYear(),
                educationDetail.getCgpa(),
                educationDetail.getIsFilled(),
                educationDetail.getBasicForm()
        );
    }
}
