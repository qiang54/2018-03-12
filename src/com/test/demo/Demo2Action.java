package com.test.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Demo2Action extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "request”Ú");
		request.getSession().setAttribute("msg", "session ”Ú");
		ServletActionContext.getServletContext().setAttribute("msg", "application”Ú");
		return SUCCESS;
	}
}
