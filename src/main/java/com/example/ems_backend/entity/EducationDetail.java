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
@Table(name = "education_detail")
public class EducationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long edu_id;

    @Column(name = "ssc_percentage")
    private Double sscPercentage;

    @Column(name = "hsc_percentage")
    private Double hscPercentage;

    @Column(name = "ssc_passing_year")
    private Long sscPassingYear;

    @Column(name = "hsc_passing_year")
    private Long hscPassingYear;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "degree")
    private String degree;

    @Column(name = "passing_year")
    private String passingYear;

    @Column(name = "cgpa")
    private Double cgpa;

    @Column(name = "is_filled")
    private Boolean isFilled;

    @OneToOne
    @JoinColumn(name = "e_id")
    private BasicForm basicForm;
}
