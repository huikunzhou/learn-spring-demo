package com.zhou.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Java配置是通过@Configuration和@Bean来实现
 * @Configuration 声明当前类是一个配置类，相当于一个spring配置的ml文件
 * @Bean 注解在方法上，声明当前方法的返回值是一个bean
 *
 */


@Configuration
public class JavaConfig {
	
	// 使用@Bean注解声明当前方法FunctionService的返回值是一个Bean，Bean的名称是方法名
	@Bean
	public FunctionService functionService() {
		
		return new FunctionService();
	}
	
	@Bean
	public UserFunService usereFunService() {
		
		UserFunService userFuncService = new UserFunService();
		
		userFuncService.setFunctionService(functionService());
		
		return userFuncService;
	}
	
	// 另一種注入方式
	// 在spring容器中，只要容器中存在某个bean，就可以在另外一个bean的声明方法的参数中写入
	@Bean
	public UserFunService usereFunService(FunctionService functionService) {
		
		UserFunService userFuncService = new UserFunService();
		
		userFuncService.setFunctionService(functionService);
		
		return userFuncService;
	}
	
	

}
