package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.PersonalDetailDto;
import com.example.ems_backend.entity.PersonalDetail;

public class PersonalDetailMapper {
    public static PersonalDetailDto mapToPersonalDetailDto(PersonalDetail personalDetail){
        return new PersonalDetailDto(
                personalDetail.getP_id(),
                personalDetail.getGender(),
                personalDetail.getDob(),
                personalDetail.getBasicForm(),
                personalDetail.getAddress(),
                personalDetail.getCity(),
                personalDetail.getIsFilled()
        );
    }

    public static PersonalDetail mapToPersonalDetail(PersonalDetailDto personalDetailDto){
        return new PersonalDetail(
                personalDetailDto.getP_id(),
                personalDetailDto.getGender(),
                personalDetailDto.getDob(),
                personalDetailDto.getBasicForm(),
                personalDetailDto.getAddress(),
                personalDetailDto.getCity(),
                personalDetailDto.getIsFilled()
        );
    }
}
