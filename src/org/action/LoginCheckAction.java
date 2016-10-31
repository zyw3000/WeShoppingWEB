package org.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.model.Users;
import org.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginCheckAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		response = arg0;
	}
	
	public void login() throws IOException {
		String userNum = request.getParameter("usernum");
		String password = request.getParameter("password");
		Users user = userService.searchUser(userNum, password);
		if(user != null){
			PrintWriter out = response.getWriter();
			out.print(makeUsertoJSON(user).toString());
			out.flush();
			out.close();
		}
	}

	private JSONObject makeUsertoJSON(Users user) {
		JSONObject json = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		Users u = new Users();
		u.setUsersNum(user.getUsersNum());
		u.setUsersName(user.getUsersName());
		u.setUsersPassword(user.getUsersPassword());
		u.setUsersBalance(user.getUsersBalance());
		u.setUsersType(user.getUsersType());
		u.setUsersMessage(user.getUsersMessage());
		jsonArray = jsonArray.fromObject(u);
		json.put("result", jsonArray);
		return json;
	}

}
