package com.zhou.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
@ComponentScan("com.zhou.ch3.taskexecutor")
@EnableAsync  // 开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {
	
	@Override
	public Executor getAsyncExecutor() {
		
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		
		// 线程池维护线程的最少数量
		taskExecutor.setCorePoolSize(4);
		// 线程池维护线程的最大数量
		taskExecutor.setMaxPoolSize(10);
		// 缓存队列
		taskExecutor.setQueueCapacity(25);
		
		taskExecutor.initialize();
		
		return taskExecutor;
	}
	
	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
