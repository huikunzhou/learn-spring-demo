package com.zhou.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @Description: SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
 * 
 * @ContextConfiguration 用来加载ApplicationContext，其中classes属性用来加载配置类
 * @ActiveProfiles 用来声明活动的profile
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
	
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject() {
		
		String expected = "from production profile";
		String actual = testBean.getContent();
		// 校验
		Assert.assertEquals(expected, actual);
	}

}
