package com.zhou.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

	// @Conditional注解使得 符合Windows条件则实例化windowsListService
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService() {
		
		return new WindowsListService();
	}
	
}
