package com.jerry.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("ǰ3");
		// �ֶ�ִ��Ŀ�귽��
		Object obj = mi.proceed();
		System.out.println("��3");
		return obj;
	}

}
