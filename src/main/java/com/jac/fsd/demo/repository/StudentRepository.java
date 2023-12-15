package com.jac.fsd.demo.repository;

import com.jac.fsd.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
