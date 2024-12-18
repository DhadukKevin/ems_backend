package com.example.ems_backend.repository;

import com.example.ems_backend.entity.PersonalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonalDetailRepository extends JpaRepository<PersonalDetail,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM public.personal_detail where e_id =:empId")
    PersonalDetail findByEmpId(Long empId);

}
