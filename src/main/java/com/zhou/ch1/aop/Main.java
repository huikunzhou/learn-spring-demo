package com.zhou.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		
		DemoAnnotationService bean = context.getBean(DemoAnnotationService.class);
		DemoMethodServie bean2 = context.getBean(DemoMethodServie.class);
		
		bean.addFun();
		bean2.add();
		
		context.close();
		
	}

}
