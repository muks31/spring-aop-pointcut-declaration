package com.mukscode.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
	
	@Pointcut("execution(* com.mukscode.aop.dao.*.*(..))")
	private void forDaoPackage() {
		
	}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=======>>>>> Executing @Before Advice on method");
	}
	
	@Before("forDaoPackage()")
	public void performAPIAnalytics() {
		System.out.println("\n=======> Performing API Analytics");
	}

}
