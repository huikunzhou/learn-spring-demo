package com.zhou.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		
		ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
		
//		bean.reportCurruntTime();
//		bean.fixTimeExecution();
//		
//		context.close();
		
	}

}
