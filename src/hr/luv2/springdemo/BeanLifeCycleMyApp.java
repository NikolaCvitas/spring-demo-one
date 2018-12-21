package hr.luv2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hr.luv2.springdemo.database.Database;

public class BeanLifeCycleMyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("trackCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		

		
		context.close();
		

	}
	


}
