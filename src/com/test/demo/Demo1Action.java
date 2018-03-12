package com.test.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 完全解耦合方式
 * @author qiang
 *
 */
public class Demo1Action extends ActionSupport{

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		ActionContext context = ActionContext.getContext();
		
		Map<String, Object> map = context.getParameters();
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String[] vals = (String[]) map.get(key);
			System.out.println(key + " :" + Arrays.toString(vals));
		}
		
		context.put("msg", "request域，最小");
		context.getSession().put("msg", "session域");
		context.getApplication().put("msg", "application域，最大");
		return SUCCESS;
	}
}
