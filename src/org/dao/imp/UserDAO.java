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
	
}
