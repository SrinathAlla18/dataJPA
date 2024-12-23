package com.srinath.dataJPA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Teacher {
    @Id
    private Long teacherId;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy ="teacher",cascade = CascadeType.ALL)
    private List<Course> courses;

}
