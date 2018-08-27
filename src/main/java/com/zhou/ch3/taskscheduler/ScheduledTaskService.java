package com.zhou.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 
 * @Description: 计划任务执行类
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

@Service
public class ScheduledTaskService {
	
	private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");
	
	// @Scheduled 声明改方法时计划任务，使用fixedRate每隔固定时间执行
	@Scheduled(fixedRate = 5000)
	public void reportCurruntTime() {

		System.out.println("每五秒执行一次： " + dataFormat.format(new Date()));
	}
	
	// 使用cron属性可按照指定时间执行，指每天11点28分执行；cron是UNIX和类UNIX(Linux)系统下的定时任务。
	@Scheduled(cron = "0 26 21 ? * *")
	public void fixTimeExecution() {
		
		System.out.println("在指定时间：" + dataFormat.format(new Date()) + "执行！");
	}

}
