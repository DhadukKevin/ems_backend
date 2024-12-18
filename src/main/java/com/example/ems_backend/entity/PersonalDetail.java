package com.example.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personal_detail")
public class PersonalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long p_id;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private java.sql.Date dob;

    @OneToOne
    @JoinColumn(name = "e_id")
    private BasicForm basicForm;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "isFilled")
    private Boolean isFilled;
}
