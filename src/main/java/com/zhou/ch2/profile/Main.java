package com.zhou.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		// 先将活动的profile设置为prod
		context.getEnvironment().setActiveProfiles("prod");
//		context.getEnvironment().setActiveProfiles("dev");
		// 后置注册Bean配置类，不然会报错误（Bean未定义）
		context.register(ProfileConfig.class);
		// 刷新容器
		context.refresh();
		
		DemoBean bean = context.getBean(DemoBean.class);
		
		System.out.println(bean.getContent());
		
		context.close();
		
	}

}
