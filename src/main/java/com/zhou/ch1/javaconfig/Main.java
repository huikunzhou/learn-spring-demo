package com.zhou.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 使用AnnotationConfigApplicationContext可以实现基于Java的配置类加载Spring的应用上下文。
		// 避免使用application.xml进行配置。相比XML配置，更加便捷。
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		UserFunService bean = context.getBean(UserFunService.class);
		
		System.out.println(bean.sayFun("java config"));
		
		context.close();
		
	}
	
//	@Test
//	public void testFun() {
//		AnnotationConfigApplicationContext context = 
//				new AnnotationConfigApplicationContext(DiConfig.class);
//		
//		UserService bean = context.getBean(UserService.class);
//		
//		System.out.println(bean.sayWhat("dii"));
//		
//		context.close();
//		
//	}

}
