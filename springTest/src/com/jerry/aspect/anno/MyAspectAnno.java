package com.jerry.aspect.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectAnno {

	// ǰ��֪ͨ
	@Before("execution(* com.jerry.aspect.anno.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("ǰ��֪ͨ��" + joinPoint.getSignature().getName());
	}

	// �������������
	@Pointcut(value = "execution(* com.jerry.aspect.anno.UserServiceImpl.*(..))")
	private void myPointCut() {

	}

	// ����֪ͨ
	@AfterReturning(value = "myPointCut()", returning = "ret")
	public void myAfterReturning(JoinPoint joinPoint, Object ret) {
		System.out.println("����֪ͨ��" + joinPoint.getSignature().getName()
				+ " , -->" + ret);
	}

	// ����֪ͨ
	@Around(value = "myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("ǰ");
		// �ֶ�ִ��Ŀ�귽��
		Object obj = joinPoint.proceed();

		System.out.println("��");
		return obj;
	}

	// �쳣֪ͨ
	@AfterThrowing(value = "execution(* com.jerry.aspect.anno.UserServiceImpl.*(..))", throwing = "e")
	public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("�׳��쳣֪ͨ �� " + e.getMessage());
	}

	// ����֪ͨ
	@After("myPointCut()")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("����֪ͨ");
	}
}
