package com.zhou.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @Description: Spring Aware可以使Bean意识到Spring容器的存在，且可调用Spring所提供的功能。
 * 
 * Spring提供的Aware接口：
 * 
 * 		BeanNameAware: 获得到容器中Bean的名称
 * 		BeanFactoryAware: 获得当前bean factory，这样可以调用容器的服务
 * 		ResourceLoaderAware: 获得资源加载器，可以获得外部资源文件
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		
		AwareService awareService = context.getBean(AwareService.class);
		
		awareService.outputResult();

		context.close();
	}

}
