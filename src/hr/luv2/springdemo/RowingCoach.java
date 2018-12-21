package hr.luv2.springdemo;

import hr.luv2.springdemo.services.SportService;

public class RowingCoach implements Coach {
	
	private SportService sportService;
	
	public RowingCoach(SportService theSportService) {
		sportService = theSportService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Row for 60 minutes.";
	}

	@Override
	public String getTeamName() {

		return sportService.getProps();
	}

}
