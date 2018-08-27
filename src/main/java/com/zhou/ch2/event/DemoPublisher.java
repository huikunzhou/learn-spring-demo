package com.zhou.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 
 * @Description: 事件发布类
 *
 * @author zhk
 * @version 2.0 2018年8月26日
 *
 */

@Component
public class DemoPublisher {
	
	// 注入ApplicationContext用来发布事件
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {

		applicationContext.publishEvent(new DemoEvent(this, msg));
	}

}
