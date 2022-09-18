package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside tennis coach doMyStartupStuff");
		System.out.println(email);
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside tennis coach doMyCleanupStuff");
		System.out.println(team);
	}
	
	//define a setter method
	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println("setting fortune service"); fortuneService =
	 * theFortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Practise your bankhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
