package com.zhou.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Description: @Conditional根据满足某一特定条件创建一个特定的bean（做自动化配置）
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		ListService bean = context.getBean(ListService.class);
		
		System.out.println(context.getEnvironment().getSystemEnvironment());
		
		System.out.println(context.getEnvironment().getProperty("os.name") + " 系统下的列表命令为： " +bean.showListCmd());

	}

}
