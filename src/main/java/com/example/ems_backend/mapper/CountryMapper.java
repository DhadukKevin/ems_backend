package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.CountryDto;
import com.example.ems_backend.entity.Country;

public class CountryMapper {
    public static CountryDto mapToCountryDto(Country country){
        return new CountryDto(
                country.getId(),
                country.getCountryName()
        );
    }

    public static  Country mapToCountry(CountryDto countryDto){
        return new Country(
                countryDto.getId(),
                countryDto.getCountryName()
        );
    }
}
