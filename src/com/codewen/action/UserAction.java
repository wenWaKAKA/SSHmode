package com.codewen.action;

import com.codewen.entity.User;
import com.codewen.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user=new User();

	@Override
	public User getModel() {
		return user;
	}
	
	

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	public String login() {
		System.out.println("action.......login");
		User b=userService.login(user);
		if (b.getUsername()==null) {
			this.addActionError("false username or password");
			return INPUT;
		}else {
			return SUCCESS;
		}
		
	}
//	@Override
//	public String execute() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println(user.toString());
//		System.out.println("action..............");
//		userService.add(user);
//		return NONE;
//	}

}
