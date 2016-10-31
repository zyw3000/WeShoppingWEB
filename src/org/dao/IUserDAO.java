package org.dao;

import java.util.List;

import org.model.Users;

public interface IUserDAO {
	
	public Users serchUser(String userNum, String password);
	
	public boolean addUser(Users user);
	
	public boolean deleteUser(String userNum);
	
	public boolean updateUser(Users user);
	
	public List allUser();
	
}
