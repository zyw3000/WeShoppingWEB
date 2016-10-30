package org.action;

import java.util.List;

import org.dao.IUserDAO;
import org.model.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserDAO dao = (IUserDAO) ctxt.getBean("myuserDAO");
		Users user = dao.serchUser("1001", "123456");
		System.out.println(user);
	}

}
