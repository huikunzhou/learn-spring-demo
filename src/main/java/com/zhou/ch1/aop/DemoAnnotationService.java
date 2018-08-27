package com.zhou.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 
 * @Description: 编写使用注解的被拦截类：类下面的方法采用注解来拦截
 *
 * @author zhk
 * @version 2.0 2018年8月26日
 *
 */

@Service
public class DemoAnnotationService {
	
	@Action(name = "注解式拦截的add操作")
	public void addFun() {};

}
