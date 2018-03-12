package com.test.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 属性驱动方式--封装数据
 * @author qiang
 *
 */
public class Rigist1Action extends ActionSupport {
	private String username;
	private String password;
	private String age;
	//属性驱动,只需setter
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
