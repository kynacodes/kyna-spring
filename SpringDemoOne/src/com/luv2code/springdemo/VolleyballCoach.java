package com.luv2code.springdemo;

public class VolleyballCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
		
	//define a constructor for dependency injection
	public VolleyballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice serving for 10 minutes.";
	}

	@Override
	public String getDailyFortune() {

		return null;
	}

}
