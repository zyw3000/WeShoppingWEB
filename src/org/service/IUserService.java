package org.service;

import org.model.Users;

public interface IUserService {
	
	public Users searchUser(String userNum, String password);
	
	public boolean addUser(Users user);
	
	public boolean deleteUser(String userNum);
	
	public boolean updateUser(Users user);
	
}