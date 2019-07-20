package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// Task 6
public class BeanPostProcessorDemoBean implements BeanPostProcessor {

//	Overrides postProcessBeforeInitialization method of BeanPostProcessor interface
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside postProcessBeforeInitialization method");
		return bean;
	}

//	Overrides postProcessAfterInitialization method of BeanPostProcessor interface
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside postProcessAfterInitialization method");
		return bean;
	}
}
