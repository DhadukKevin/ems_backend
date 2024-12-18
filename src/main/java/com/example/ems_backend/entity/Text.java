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
@Table(name = "texts")
public class Text {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long t_id;

    @Column(name = "text_data")
    private String textData;

//    @Column(name = "emp_id")
//    private Long emp_id;
    @OneToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
}
