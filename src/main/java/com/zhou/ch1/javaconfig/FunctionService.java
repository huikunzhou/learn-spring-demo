package com.zhou.ch1.javaconfig;

/**
 * 
 * @Description: 编写功能类的bean，此处没有使用@Service声明
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

public class FunctionService {

	
	public String sayHey(String word) {
		
		return "hello " + word + "!";
	}
	
}
