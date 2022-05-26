package com.coderwizard.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderwizard.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
