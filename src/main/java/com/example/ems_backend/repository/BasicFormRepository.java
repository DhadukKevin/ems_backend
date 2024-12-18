package com.example.ems_backend.repository;

import com.example.ems_backend.entity.BasicForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BasicFormRepository extends JpaRepository<BasicForm,Long> {
    @Query(nativeQuery = true,value = "Insert into personal_detail (e_id) values (:employeeId)")
    void addEmployeeIdIntoPersonalDetail(Long employeeId);

    @Query(nativeQuery = true,value = "Insert into family_detail (e_id) values (:employeeId)")
    void addEmployeeIdIntoFamilyDetail(Long employeeId);
    @Query(nativeQuery = true,value = "Insert into education_detail (e_id) values (:employeeId)")
    void addEmployeeIdIntoEducationDetail(Long employeeId);
}
