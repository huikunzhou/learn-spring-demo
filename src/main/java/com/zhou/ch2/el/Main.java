package com.zhou.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		
		ElConfig bean = context.getBean(ElConfig.class);
		
		bean.outputResouce();
		
		context.close();

	}

}
