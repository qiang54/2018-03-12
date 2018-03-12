package com.test.demo2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.domain.User;

/**
 * 模型驱动方式--封装数据
 * @author qiang
 *
 */
public class Rigist3Action extends ActionSupport implements ModelDriven<User>{

	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println(user);
		return NONE;
	}


	
}
