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
//			ApplicationContext objects
			ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
			Movie movie1 = context.getBean("movieObj",Movie.class);
			movie1.display();
			
			ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
			Movie movie2 = context1.getBean("movieObj",Movie.class);
			movie2.display();
			
//			BeanFactory object
			BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/beans.xml"));
			Movie movie3 = factory.getBean("movieObj",Movie.class);
			movie3.display();
			
//			BeanDefinitionRegistry object
			BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
			BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
			beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
			Movie movie4= (Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movieObj");
			movie4.display();
			
		}

}
