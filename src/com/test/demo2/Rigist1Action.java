package com.test.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ����������ʽ--��װ����
 * @author qiang
 *
 */
public class Rigist1Action extends ActionSupport {
	private String username;
	private String password;
	private String age;
	//��������,ֻ��setter
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String execute() throws Exception {
		
		
		System.out.println(username +" "+ password +" "+age);
		return NONE;
	}

}
