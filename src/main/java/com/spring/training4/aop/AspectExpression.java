package com.spring.training4.aop;

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

@Aspect
@Component
public class AspectExpression {
	@Pointcut(value = "execution(* com.spring.training4.bean.CompanyBean.getName(..))")
	public void pointCut() {
	}

	 //@Before(value = "pointCut()")
	public void beforeAspectAdvice(JoinPoint jp) {
		System.out.println("@@BEFORE advice " + jp.getSignature());
	}

	//@After(value = "pointCut()")
	public void afterAspectAdvice(JoinPoint jp) {
		System.out.println("@@AFTER advice " + jp.getSignature());
	}

	 //@Around(value = "pointCut()")
	public Object aroundAspectAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("@@AROUND 1 advice " + jp.getSignature());
		Object result = jp.proceed();
		System.out.println("@@AROUND 2 advice " + jp.getSignature());
		return result;
	}

	//@AfterReturning(value = "pointCut()", returning = "result")
	public void afterReturningAspectAdvice(JoinPoint jp, Object result) {
		System.out.println("@@AFTER returning advice " + jp.getSignature());
		System.out.println("Result : " + result);
		result = "No comment";
	}
	
	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void afterThrowingAspectAdvice(JoinPoint jp, Throwable exception) {
		System.out.println("@@AFTER throwing advice " + jp.getSignature());
		System.out.println("Exception : " + exception);
	}

}
