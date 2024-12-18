package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.TextDto;
import com.example.ems_backend.entity.Text;

public class TextMapper {
    public static TextDto mapToTextDto(Text text){
        return new TextDto(
            text.getT_id(),
            text.getTextData(),
            text.getEmployee()
//            text.getEmp_id()
        );
    }

    public static Text mapToText(TextDto textDto){
        return new Text(
            textDto.getId(),
            textDto.getTextData(),
            textDto.getEmployee()
//            textDto.getEmp_id()
        );
    }
}
