package com.exam.impl;

import com.exam.entities.Subject;
import com.exam.repository.SubjectRepository;
import com.exam.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public Subject createSubject(Subject subject) {
       return this.subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubject(String subjectId) {
        return subjectRepository.getById(subjectId);
    }

}
