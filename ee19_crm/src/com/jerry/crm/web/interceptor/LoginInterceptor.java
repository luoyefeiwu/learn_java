package com.jerry.crm.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {

		Object obj = ActionContext.getContext().getSession().get("loginStaff");
		if (obj == null) {
			if (invocation instanceof ActionSupport) {
				ActionSupport actionSupport = (ActionSupport) invocation;
				actionSupport.addFieldError("", "ÇëµÇÂ¼");
			}
			return "login";
		}
		return invocation.invoke();
	}

}
