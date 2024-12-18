package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.BasicFormDto;
import com.example.ems_backend.entity.BasicForm;

public class BasicFormMapper {
    public static BasicFormDto mapToBasicFormDto(BasicForm basicForm){
        return  new BasicFormDto(
            basicForm.getId(),
            basicForm.getYourName(),
            basicForm.getEmail(),
            basicForm.getPhone()
        );
    }

    public  static  BasicForm mapToBasicForm(BasicFormDto basicFormDto){
        return new BasicForm(
            basicFormDto.getId(),
            basicFormDto.getYourName(),
            basicFormDto.getEmail(),
            basicFormDto.getPhone()
        );
    }
}
