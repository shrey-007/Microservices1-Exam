package com.exam.repository;

import com.exam.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject ,String> {
}
