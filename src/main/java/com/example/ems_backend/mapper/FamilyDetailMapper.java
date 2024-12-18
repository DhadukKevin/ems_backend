package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.FamilyDetailDto;
import com.example.ems_backend.entity.FamilyDetail;

public class FamilyDetailMapper {
    public static FamilyDetailDto mapToFamilyeDetailDto(FamilyDetail familyDetail){
        return new FamilyDetailDto(
                familyDetail.getF_id(),
                familyDetail.getFatherName(),
                familyDetail.getMotherName(),
                familyDetail.getFatherOccupation(),
                familyDetail.getMotherOccupation(),
                familyDetail.getFatherMobile(),
                familyDetail.getMotherMobile(),
                familyDetail.getIsFilled(),
                familyDetail.getBasicForm()
        );
    }

    public static FamilyDetail mapToFamilyDetail(FamilyDetailDto familyDetailDto){
        return new FamilyDetail(
                familyDetailDto.getF_id(),
                familyDetailDto.getFatherName(),
                familyDetailDto.getMotherName(),
                familyDetailDto.getFatherOccupation(),
                familyDetailDto.getMotherOccupation(),
                familyDetailDto.getFatherMobile(),
                familyDetailDto.getMotherMobile(),
                familyDetailDto.getIsFilled(),
                familyDetailDto.getBasicForm()
        );
    }
}
