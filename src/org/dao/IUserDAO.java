package org.dao;

import java.util.List;

import org.model.Users;

public interface IUserDAO {
	public Users serchUser(String userNum, String password);
	
	public List allUser();
}
