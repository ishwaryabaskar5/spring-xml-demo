package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main( String[] args )
		{
//			Task 3
//			ApplicationContext object
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			
//			Movie objects
			Movie movie = context.getBean("movieObj",Movie.class);
			movie.display();
			
			Movie movie1 = context.getBean("movieObj1",Movie.class);
			movie1.display();
			
			Movie movie2 = context.getBean("movieObj1",Movie.class);
			movie2.display();
			
		}

}
