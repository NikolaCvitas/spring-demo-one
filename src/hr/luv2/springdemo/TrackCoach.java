package hr.luv2.springdemo;

import hr.luv2.springdemo.services.SportService;

public class TrackCoach implements Coach {
	
	private SportService sportService;
	
	public TrackCoach(SportService theSportService) {
		sportService = theSportService;
	}

	@Override
	public String getDailyWorkout() {

		return "Trèi 45 minuta.";
	}

	@Override
	public String getTeamName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// add an init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : do statupStuff");
	}
	
	//add a destroy method
	
	public void doMyCleanStuffStuff() {
		System.out.println("TrackCoach : do doMyCleanStuffStuff");
	}

}
