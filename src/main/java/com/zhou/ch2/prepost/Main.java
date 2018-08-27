package com.zhou.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService bean = context.getBean(BeanWayService.class);
		JSR250WayService bean2 = context.getBean(JSR250WayService.class);
		
		context.close();
		
	}

}