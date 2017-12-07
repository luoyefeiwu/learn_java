package com.jerry.spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		// 执行前方法
		System.out.println("首4");
		// 执行当前方法
		Object obj = mi.proceed();
		// 执行后方法
		System.out.println("后4");
		return obj;
	}

}
