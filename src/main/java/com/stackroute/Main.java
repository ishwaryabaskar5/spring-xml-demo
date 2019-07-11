package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
		public static void main( String[] args )
		{
			Main mainClass = new Main();
//			Task 3
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
			
			mainClass.setApplicationContext(context);
			mainClass.setBeanFactory(factory);
			mainClass.setBeanName("movieObj");
		}
	
	//		Task 4
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		Movie movie = beanFactory.getBean("movieObj",Movie.class);
		System.out.println("Inside setBeanFactory method");
		movie.display();
	}
	
	@Override
	public void setBeanName(String s) {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Movie movie = factory.getBean(s,Movie.class);
		System.out.println("Inside setBeanName method");
		movie.display();
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Movie movie = applicationContext.getBean("movieObj",Movie.class);
		System.out.println("Inside setApplicationContext method");
		movie.display();
	}

}
