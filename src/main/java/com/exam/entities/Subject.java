package com.exam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
// database= subjectId, name, branch
public class Subject {

    @Id
    private String subjectId;
    private String name;
    private String branch;



}
