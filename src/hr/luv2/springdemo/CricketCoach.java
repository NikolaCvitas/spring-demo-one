package hr.luv2.springdemo;

import hr.luv2.springdemo.services.SportService;

public class CricketCoach implements Coach {
	
	private SportService sportService;
	
	public CricketCoach(SportService theSportService) {
		sportService = theSportService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Igraj kriket";
	}

	@Override
	public String getTeamName() {
		
		return "Ime kriket kluba";
	}
	
	public String getClubEmail() {
		return sportService.getEmail();
	}
	
	
	public String getCricketName() {
		return sportService.getTeamName();
	}

}
