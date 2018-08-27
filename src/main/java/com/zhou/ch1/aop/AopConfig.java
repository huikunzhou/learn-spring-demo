package com.zhou.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhou.ch1.aop")
@EnableAspectJAutoProxy // 开启spring对aspectj代理的支持
public class AopConfig {

}
