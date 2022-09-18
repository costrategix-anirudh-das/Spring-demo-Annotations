package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are pointing to same object
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to same object :" + result);
		
		System.out.println("Pointing to theCoach object :" + theCoach);
		
		System.out.println("Pointing to alphaCoach object :" + alphaCoach);
		
		context.close();
	}

}
