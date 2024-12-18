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
@Table(name = "basicForm")
public class BasicForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "your_name")
    private String yourName;

    @Column(name = "email_id",nullable = false,unique = true)
    private String email;

    @Column(name = "phone",nullable = false,unique = true)
    private String phone;
}
