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
public class PersonalDetailDto {
    private Long p_id;
    private String gender;
    private java.sql.Date dob;
    private BasicForm basicForm;
    private String address;
    private String city;
    private Boolean isFilled;

}
