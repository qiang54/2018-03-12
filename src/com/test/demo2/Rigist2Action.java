package com.test.demo2;

import com.opensymphony.xwork2.ActionSupport;
import com.test.domain.User;

/**
 * ����������ʽ--��װ���ݣ�JavaBean�����У�
 * @author qiang
 *
 */
public class Rigist2Action extends ActionSupport {
	
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		
		
		System.out.println(user);
		return NONE;
	}

}
