package com.exam.controller;

import com.exam.entities.Subject;
import com.exam.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject){

        Subject savedSubject=subjectService.createSubject(subject);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedSubject);
    }

    @GetMapping("/{subjectId}")
    public ResponseEntity<Subject> getSingleSubject(@PathVariable String subjectId){
        Subject subject=subjectService.getSubject(subjectId);
        return ResponseEntity.ok(subject);
    }

    @GetMapping
    public ResponseEntity <List<Subject>> getAllSubjects(){

        List<Subject> subjects=subjectService.getAllSubjects();

        return ResponseEntity.ok(subjects);
    }

}
