package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements DisposableBean, InitializingBean {
	
//	Overrides afterPropertiesSet method of InitializingBean interface
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method");
	}
	
//	Overrides destroy method of DisposableBean interface
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
	
//	custom init method
	public void customInit(){
		System.out.println("Inside customInit method");
	}
	
//	custom destroy method
	public void customDestroy(){
		System.out.println("Inside customDestroy method");
	}
}
