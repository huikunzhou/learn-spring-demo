package com.zhou.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * 
 * @Description: 演示服务bean
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

@Service
public class DemoService {

	public void outputResult() {
		
		System.out.println("从组合注解配置照样获得的bean");
	}
	
}
