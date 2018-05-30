package com.luv2code.springdemo;

public class VolleyballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Practice serving for 10 minutes.";
	}

	@Override
	public String getDailyFortune() {

		return null;
	}

}
