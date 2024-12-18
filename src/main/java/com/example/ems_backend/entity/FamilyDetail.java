package com.example.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "family_detail")
public class FamilyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long f_id;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father_occupation")
    private String fatherOccupation;

    @Column(name = "mother_occupation")
    private String motherOccupation;

    @Column(name = "father_mobile")
    private String fatherMobile;

    @Column(name = "mother_mobile")
    private String motherMobile;

    @Column(name = "is_filled")
    private Boolean isFilled;

    @OneToOne
    @JoinColumn(name = "e_id")
    private BasicForm basicForm;
}
