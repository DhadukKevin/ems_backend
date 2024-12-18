package com.example.ems_backend.repository;

import com.example.ems_backend.entity.FamilyDetail;
import com.example.ems_backend.entity.PersonalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FamilyDetailRepository extends JpaRepository<FamilyDetail,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM public.family_detail where e_id =:empId")
    FamilyDetail findByEmpId(Long empId);
}
