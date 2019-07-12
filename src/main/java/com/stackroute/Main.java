package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main( String[] args ) {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			BeanLifecycleDemoBean beanLifecycleDemoBean =  (BeanLifecycleDemoBean) context.getBean("beanLifeCycle");
		}
}
