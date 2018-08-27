package com.zhou.ch1.javaconfig;

/**
 * 
 * @Description: 编写功能类的bean
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

public class UserFunService {
	
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		
		this.functionService = functionService;
	}
	
	public String sayFun(String word) {
		
		return functionService.sayHey(word);
	}

}
