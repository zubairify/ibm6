package com.ibm.service;

import java.time.LocalDate;
import java.util.List;

import com.ibm.entity.Todo;

public interface TodoService {

	int add(Todo todo, int uid);
	
	Todo fetch(int id);
	
	List<Todo> todoByUser(int uid);
	
	List<Todo> pendingTodos(int uid);
	
	List<Todo> completedTodos(LocalDate until);
	
	Todo update(Todo todo);
}
