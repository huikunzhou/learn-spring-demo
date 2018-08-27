package com.zhou.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service 声明当前类是spring管理的一个bean
// 等效于使用 @Component, @Service, @Repository, @Controller
@Service
public class UserService {

	// 将FunctionService的实体bean注入到UserService中，让UserService具备FunctionService的功能
	// 此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解式等效的
	@Autowired
	FunctionService funService;	
	
	public String sayWhat(String word) {
		
		return funService.sayWhat(word);
	}
	
}
