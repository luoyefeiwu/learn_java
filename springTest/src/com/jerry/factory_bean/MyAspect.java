package com.jerry.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("前3");
		// 手动执行目标方法
		Object obj = mi.proceed();
		System.out.println("后3");
		return obj;
	}

}
