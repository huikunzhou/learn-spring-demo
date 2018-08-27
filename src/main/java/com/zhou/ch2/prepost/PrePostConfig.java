package com.zhou.ch2.prepost;

import org.springframework.context.annotation.Bean;

public class PrePostConfig {
	
	// initMethod和destroyMethod指定BeanWayService类的init和destory方法在构造之后，bean销毁之前执行。
	@Bean(initMethod = "init", destroyMethod = "destory")
	BeanWayService beanWayService() {
		
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService() {
		
		return new JSR250WayService();
	}

}
