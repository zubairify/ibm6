package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.User;
import com.ibm.pojo.Login;
import com.ibm.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public int addUser(User u) {
		repo.save(u);
		return u.getUserId();
	}

	@Override
	public User authenticate(Login login) {
		return repo.findByEmailAndPassword(login.getEmail(), login.getPassword()).orElseThrow(
				() -> new IllegalArgumentException("Invallid Email or Password"));
	}

	@Override
	public User fetch(int uid) {
		return repo.findById(uid).get();
	}

}
