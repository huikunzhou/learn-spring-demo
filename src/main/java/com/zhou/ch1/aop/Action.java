package com.zhou.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解本身没有功能，和xml一样。注解和xml都是一种元数据，即解释数据的数据，这就是所谓配置。
 * 注解的功能来自用这个注解的地方
 *
 */

// 编写拦截规则的注解

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	
	String name();

}
