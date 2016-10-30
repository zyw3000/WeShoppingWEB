package org.service.imp;

import org.dao.IUserDAO;
import org.model.Users;
import org.service.IUserService;

public class UserService implements IUserService {
	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public Users searchUser(String userNum, String password) {
		return userDAO.serchUser(userNum, password);
	}

}
