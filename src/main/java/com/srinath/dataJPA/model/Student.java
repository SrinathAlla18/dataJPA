package com.srinath.dataJPA.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    private String emailId;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;



}
