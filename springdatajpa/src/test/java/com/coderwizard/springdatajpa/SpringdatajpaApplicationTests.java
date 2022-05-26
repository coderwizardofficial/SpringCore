package com.coderwizard.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

import com.coderwizard.springdatajpa.entities.Student;
import com.coderwizard.springdatajpa.repos.StudentRepository;

import static org.junit.Assert.*;

@SpringBootTest
@EntityScan("com.coderwizard.springdatajpa.entities")
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Pramod");
		student.setTestScore(90);
		repository.save(student);

		Student saveStudent = repository.findById(1l).get();

		assertNotNull(saveStudent);
	}

}
