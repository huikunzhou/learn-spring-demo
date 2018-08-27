package com.zhou.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 
 * @Description: 任务执行类
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

@Service
public class AsyncTaskService {
	
	// @Async 注解表名改方法是个异步方法，若注解在类级别，则该类所有方法都是异步方法。
	// 而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
	@Async
	public void executeAsyncTask(Integer i) {
		
		System.out.println("执行异步任务： " + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		
		System.out.println("执行异步任务----- " + (i+1));
	}
	

}
