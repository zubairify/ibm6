package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Student;
import com.ibm.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repo;

	@Override
	public void add(Student s) {
		repo.save(s);
	}

	@Override
	public Student fetch(int rollNo) {
		return repo.findById(rollNo).get();
	}

	@Override
	public List<Student> list() {
		return repo.findAll();
	}

	@Override
	public List<Student> listBySchool(String school) {
		return repo.findBySchool(school);
	}
}
