package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Todo;
import com.ibm.service.TodoService;

@RestController
public class TodoController {

	@Autowired
	private TodoService service;
	
	@PostMapping(value = "/todo/{userid}", consumes = "application/json")
	public void add(@RequestBody Todo todo, @PathVariable int userid) {
		int id = service.add(todo, userid);
		System.out.println("Todo created with Id: " + id);
	}
	
	@GetMapping(value = "/todo/{id}", produces = "application/json")
	public Todo get(@PathVariable int id) {
		return service.fetch(id);
	}
	
	@GetMapping(value = "/todo/user/{userid}", produces = "application/json")
	public List<Todo> listUserTodo(@PathVariable int userid) {
		return service.todoByUser (userid);
	}
}
