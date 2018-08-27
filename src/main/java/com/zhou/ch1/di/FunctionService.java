package com.zhou.ch1.di;

import org.springframework.stereotype.Service;

/**
 * 
 * @Description: 编写功能类的bean
 *
 * @author zhk
 * @version 2.0 2018年8月27日
 *
 */

// 声明当前FunctionService类是spring管理的一个bean，
// 等效于使用@Component、@Service、@Repository、@Controller
@Service
public class FunctionService {
	
	public String sayWhat(String word) {
		
		System.out.println("heollo: " + word);
		return word;
	}

}
