package com.example.ems_backend.repository;

import com.example.ems_backend.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface TextRepository extends JpaRepository<Text,Long> {

    @Query(nativeQuery = true,value = "SELECT * FROM public.texts where emp_id =:employeeId")
    Text findByEmployeeId(@Param("employeeId") Long employeeId);

    @Query(nativeQuery = true,value = "update texts set text_data =:textData where emp_id =:employeeId")
    void updateTextByEmpId(@Param("employeeId") Long employeeId, @RequestBody String textData);

//    @Query(nativeQuery = true,value = "insert into texts (text_data,emp_id) values (:employeeId,:textData)")
//    void insertText(@Param("employeeId") Long employeeId,@RequestBody String textData);
}
