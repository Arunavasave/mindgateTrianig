package com.sky.aop;

//import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AnnoSecurityAspect {
	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
	public void VarifyApplicationForm() {
		System.out.println("Ina Anno before call");
	}
	
	@After("execution(* com.sky.aop.ApplicationService.*(..))")
	
	public void processResults() {
		System.out.println("process result");
	}
	
	@Before("@annotation(auditable)")
	public void doAccessCheck4(Auditable auditable) {
		System.out.println("do access check 4 "+" "+auditable.value());
	}

}
