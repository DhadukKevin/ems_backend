package com.example.ems_backend.repository;

import com.example.ems_backend.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends JpaRepository<Country,Long> , PagingAndSortingRepository<Country,Long> {

}
