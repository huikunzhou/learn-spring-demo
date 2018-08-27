package com.zhou.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		
		DemoPublisher bean = context.getBean(DemoPublisher.class);
		
		bean.publish("hello application event");
		
		context.close();
		
	}

}
