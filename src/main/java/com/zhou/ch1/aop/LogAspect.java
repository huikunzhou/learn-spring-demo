package com.zhou.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 	
 * @Description: 编写切面
 *
 * @author zhk
 * @version 2.0 2018年8月26日
 *
 */

@Aspect // 声明一个切面
@Component // 让此切面成为二spring容器管理的bean
public class LogAspect {

	// @Pointcut 声明切点
	@Pointcut("@annotation(com.zhou.ch1.aop.Action)")
	public void annotationPointCut() {};
	
	// @After 声明一个建言advice，并使用@Pointcut定义的切点
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		
		Action action = method.getAnnotation(Action.class);
		
		// 通过反射可获得注解上的属性，并做日志记录相关的操作，下同。
		System.out.println("注解式拦截: " + action.name());
		
	}
	
	// @Before 声明一个建言，此建言直接使用拦截规则作为参数	
	@Before("execution(* com.zhou.ch1.aop.DemoMethodServie.*(..))")
	public void before(JoinPoint joinPoint) {
		
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		// 拦截了方法
		Method method = signature.getMethod();
		
		System.out.println("方法规则式拦截: " + method.getName());
	}
	
}
