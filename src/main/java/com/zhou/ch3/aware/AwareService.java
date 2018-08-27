package com.zhou.ch3.aware;


import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

// 实现BeanNameAware、ResourceLoaderAware接口，获得bean名称和资源加载的服务
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader loader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {

		this.beanName = name;
	}
	
	public void outputResult() {
		
		System.out.println("Bean的名称为：" + beanName);
		
		Resource resource = (Resource) loader.getResource("classpath:com/zhou/ch3/aware/test.txt");
		
		try {
			System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
