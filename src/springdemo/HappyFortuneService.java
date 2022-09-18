package springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println("Inside Happyfortune default constructor");
	}
	
	@Override
	public String getFortune() {
		return "Today is lucky day";
	}

}
