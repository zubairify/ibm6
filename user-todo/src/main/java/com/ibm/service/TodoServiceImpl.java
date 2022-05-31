package com.ibm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Todo;
import com.ibm.entity.User;
import com.ibm.repo.TodoRepository;
@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository repo;
	
	@Autowired
	private UserService uservice;
	
	@Override
	public int add(Todo todo, int uid) {
		User usr = uservice.fetch(uid);
		todo.setUser(usr);
		repo.save(todo);
		return todo.getId();
	}

	@Override
	public Todo fetch(int id) {
		return null;
	}

	@Override
	public List<Todo> todoByUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Todo> pendingTodos(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Todo> completedTodos(LocalDate until) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo update(Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}

}
