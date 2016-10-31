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

	public boolean addUser(Users user) {
		return userDAO.addUser(user);
	}

	public boolean deleteUser(String userNum) {
		return userDAO.deleteUser(userNum);
	}

	public boolean updateUser(Users user) {
		return userDAO.updateUser(user);
	}

}
