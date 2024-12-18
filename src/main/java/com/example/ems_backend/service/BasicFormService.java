package com.example.ems_backend.service;

import com.example.ems_backend.dto.BasicFormDto;

import java.util.List;

public interface BasicFormService {
    BasicFormDto createBasicForm(BasicFormDto basicFormDto);

    List<BasicFormDto> getAllBasicForm();
}
