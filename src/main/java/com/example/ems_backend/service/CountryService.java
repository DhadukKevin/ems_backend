package com.example.ems_backend.service;

import com.example.ems_backend.entity.Country;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountry();
    Page<Country> getCountryInPage(int pageNo);

}
