package com.exam.service;

import com.exam.entities.Subject;

import java.util.List;

public interface SubjectService {

    Subject createSubject(Subject subject);

    List<Subject> getAllSubjects();
    Subject getSubject(String subjectId);

}
