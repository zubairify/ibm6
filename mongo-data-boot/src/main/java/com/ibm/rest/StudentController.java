package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Student;
import com.ibm.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String add(@RequestBody Student s) {
		service.add(s);
		return "Student added";
	}
	
	@GetMapping(value = "/get/{rollno}", produces = "application/json")
	public Student get(@PathVariable int rollno) {
		return service.fetch(rollno);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Student> list() {
		return service.list();
	}
	
	@GetMapping(value = "/school/{school}", produces = "application/json")
	public List<Student> school(@PathVariable String school) {
		return service.listBySchool(school);
	}
}
