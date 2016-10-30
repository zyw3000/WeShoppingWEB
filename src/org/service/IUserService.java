package org.service;

import org.model.Users;

public interface IUserService {
	public Users searchUser(String userNum, String password);

}
