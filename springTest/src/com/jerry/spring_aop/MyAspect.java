package com.jerry.spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		// ִ��ǰ����
		System.out.println("��4");
		// ִ�е�ǰ����
		Object obj = mi.proceed();
		// ִ�к󷽷�
		System.out.println("��4");
		return obj;
	}

}
