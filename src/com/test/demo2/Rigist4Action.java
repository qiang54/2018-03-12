package com.test.demo2;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.test.domain.User;

/**
 * ����������ʽ--��װ���ݣ�JavaBean�����У�
 * @author qiang
 *
 */
public class Rigist4Action extends ActionSupport {
	
	private List<User> list;
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	@Override
	public String execute() throws Exception {
		
		for (User user : list) {
			System.out.println(user);
		}
		
		return NONE;
	}

}
