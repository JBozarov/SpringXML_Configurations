package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {

//		Fruit fruit = new Fruit(); 
//		Vegetable vegetable = new Vegetable(); 
		
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		Fruit fruit = context.getBean("fruit", Fruit.class); 
		Vegetable vegetable = (Vegetable) context.getBean("vegetable");
		
		System.out.println(fruit.talkAboutYourself());
		System.out.println(vegetable.talkAboutYourself());
	}

}
