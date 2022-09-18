package springdemo;

import org.springframework.stereotype.Component;

@Component("callCricketCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise Bowling 1 hr";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
