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
				System.out.println("存在该用户");
			}else {
				System.out.println("不存在该用户");
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
