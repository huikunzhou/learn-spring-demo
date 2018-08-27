package com.zhou.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 
 * @Description: 事件监听器
 *
 * @author zhk
 * @version 2.0 2018年8月26日
 *
 */

// 实现ApplicationListener接口，并指定监听的事件类型
@Service
public class DemoListener implements ApplicationListener<DemoEvent> {

	// 使用onApplicationEvent方法对消息进行接收处理
	public void onApplicationEvent(DemoEvent event) {
		
		String msg = event.getMsg();
		
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息：" + msg);
		
	}

}
