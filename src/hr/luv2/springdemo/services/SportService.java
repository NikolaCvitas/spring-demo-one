package hr.luv2.springdemo.services;

public class SportService {
	
	private String email;
	
	private String teamName;
	
	public SportService() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getProps() {
		return "SportService properties";
	}
	
	
	

}
