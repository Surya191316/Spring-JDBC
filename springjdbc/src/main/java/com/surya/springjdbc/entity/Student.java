package com.surya.springjdbc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // For Table
@Data  // For getter and setters
@Table(name = "Student")  // Table name
@NoArgsConstructor   // For default constructor
@AllArgsConstructor   // For parameterised constructor
public class Student {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private Integer age;
}



