package com.ibm.service;

import java.util.List;

import com.ibm.model.Student;

public interface StudentService {

	void add(Student s);
	
	Student fetch(int rollNo);
	
	List<Student> list();
	
	List<Student> listBySchool(String school);
}
