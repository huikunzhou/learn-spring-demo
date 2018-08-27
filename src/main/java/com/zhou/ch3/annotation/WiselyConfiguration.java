package com.zhou.ch3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @Description: 元注解的作用就是负责注解其他注解。
 * 					annotation(@Retention@Target)详解 【 https://www.cnblogs.com/gmq-sh/p/4798194.html 】
 * 
 * 
 * 自定义注解：使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口，由编译程序自动完成其他细节。
 * 			在定义注解时，不能继承其他的注解或接口。@interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。
 * 			方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。
 * 			可以通过default来声明参数的默认值。
 * 格式： public @interface 注解名 {定义体}
 * 
 * 【https://www.cnblogs.com/keyi/p/6797282.html】
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration // 组合@Configuration元注解
@ComponentScan // 组合@ComponentScan元注解
public @interface WiselyConfiguration {
	
	// 覆盖value参数
	String[] value() default {};

}
