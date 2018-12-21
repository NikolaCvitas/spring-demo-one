package hr.luv2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hr.luv2.springdemo.database.Database;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballCoach theCoach = new BaseballCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
		Coach rowing = context.getBean("myRowingCoach",Coach.class);
		
		
		System.out.println(rowing.getDailyWorkout());
		
		
		System.out.println(rowing.getTeamName());
		
		
		CricketCoach cricket = context.getBean("myCricketCoach",CricketCoach.class);
		
		
		System.out.println(cricket.getClubEmail());
		
		initApp(context);
		
		
		

	}
	
	private static void initApp(ClassPathXmlApplicationContext context) {
		Database database = context.getBean("database",Database.class);
		
		System.out.println(database.getSchema());
	}

}
