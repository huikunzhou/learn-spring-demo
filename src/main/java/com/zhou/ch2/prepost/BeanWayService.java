package com.zhou.ch2.prepost;

/**
 * 
 * @Description: 使用@Bean形式的bean
 *
 * @author zhk
 * @version 2.0 2018年8月26日
 *
 */

public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService() {
		super();
		
		System.out.println("初始化构造函数-BeanWayService");
	}

	public void destory() {
		
		System.out.println("@Bean-destory-method");
	}
}
