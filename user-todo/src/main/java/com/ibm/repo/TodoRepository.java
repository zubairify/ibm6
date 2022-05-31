package com.ibm.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	@Query(value = "select * from todos where user_id=:uid", nativeQuery = true)
	List<Todo> findByUser(int uid);
	
	@Query(value = "select * from todos where status='Pending' and user_id=:uid", nativeQuery = true)
	List<Todo> findPendingTodos(int uid);
	
	@Query("FROM Todo WHERE finishDate <= :until")
	List<Todo> findCompletedTodos(LocalDate until);
}
