package com.example.ems_backend.repository;

import com.example.ems_backend.entity.EducationDetail;
import com.example.ems_backend.entity.FamilyDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EducationDetailRepository extends JpaRepository<EducationDetail,Long> {

    @Query(nativeQuery = true,value = "SELECT * FROM public.education_detail where e_id =:empId")
    EducationDetail findByEmpId(Long empId);

}
