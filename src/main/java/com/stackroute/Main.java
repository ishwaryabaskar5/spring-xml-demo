package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
		public static void main( String[] args )
		{
//			Task 1 - Using ApplicationContext
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Movie movie1 = context.getBean("movieObj",Movie.class);
			movie1.display();
			
//			Task 1 - Using BeanFactory
			BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/beans.xml"));
			Movie movie2 = factory.getBean("movieObj",Movie.class);
			movie2.display();
			
			BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
			BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
			beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
			Movie movie3= (Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movieObj");
			movie3.display();
			
//			Task2
//			Movie objects creation and display method call
			Movie movie4 = context.getBean("movieObj1",Movie.class);
			movie4.display();
			
			Movie movie5 = context.getBean("movieObj2",Movie.class);
			movie5.display();
			
			Movie movie6 = context.getBean("movieObj3",Movie.class);
			movie6.display();
			
			Movie movie7 = context.getBean("movieObj3",Movie.class);
			
			System.out.println(movie6 == movie7);
			
			Movie movie8 = (Movie) context.getBean("movieObject");
			movie8.display();
		}

}
