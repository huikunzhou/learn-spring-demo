package com.zhou.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	
	// profile 为 dev 时实例化devDemoBean
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		
		return new DemoBean("from development profile");
	}

	// profile 为 prod 时实例化prodDemoBean
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		
		return new DemoBean("from production profile");
	}
}
