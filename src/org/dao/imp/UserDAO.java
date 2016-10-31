package org.dao.imp;

import java.util.List;

import org.dao.IUserDAO;
import org.model.Users;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDAO extends HibernateDaoSupport implements IUserDAO {

	public Users serchUser(String userNum, String password) {
		Users user = null;
		try{
			List list = getHibernateTemplate().find("from Users u " + 
					"where u.usersNum = '" + userNum +
					"' and u.usersPassword = '" + password + "'");
			if(list.size() > 0){
				user = (Users) list.get(0);
				System.out.println("���ڸ��û�");
			}else {
				System.out.println("�����ڸ��û�");
			}
		} catch (DataAccessException e){
			e.printStackTrace();
		}
		return user;
	}

	public List allUser() {
		List list = getHibernateTemplate().find("from Users");
		return list;
	}

	public boolean addUser(Users user) {
		try{
			getHibernateTemplate().save(user);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteUser(String userNum) {
		String hql = "from Users u " + "where u.usersNum = '" + userNum + "'";
		try{
			getHibernateTemplate().delete(hql);
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateUser(Users user) {
		try{
			List list = getHibernateTemplate().find("from Users u " + 
					"where u.usersId = '" + user.getUsersId() + "'");
			if(list.size() > 0){
				Users newU = (Users) list.get(0);
				getHibernateTemplate().update(newU);
				return true;
			}else {
				System.out.println("�����ڸ��û�");
				return false;
			}
		} catch (DataAccessException e){
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
