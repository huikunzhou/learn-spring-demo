package com.zhou.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration 声明当前类是一个配置类
// @ComponentScan 自动扫描包下所有使用注解声明的类，并注册为bean
@Configuration
@ComponentScan("com.zhou.ch1.di")
public class DiConfig {

}
