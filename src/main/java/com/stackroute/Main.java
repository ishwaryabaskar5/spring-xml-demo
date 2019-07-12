package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main  {
		public static void main( String[] args )
		{
			
			ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
			Movie movie1 = context1.getBean("movieObj",Movie.class);
			movie1.display();
			
		}
	

}
