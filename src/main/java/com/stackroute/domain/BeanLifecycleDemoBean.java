package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements DisposableBean, InitializingBean {
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		
	}
	public void customInit(){
		System.out.println("Inside customInit method");
	}
	
	public void customDestroy(){
		System.out.println("Inside customDestroy method");
	}
}
