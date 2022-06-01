package com.ibm.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

	List<Student> findBySchool(String school);
}
