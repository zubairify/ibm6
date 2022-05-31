package com.ibm.service;

import com.ibm.entity.User;
import com.ibm.pojo.Login;

public interface UserService {

	int addUser(User u);
	
	User fetch(int uid);
	
	User authenticate(Login login);
}
