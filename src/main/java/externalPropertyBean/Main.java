package externalPropertyBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("externalProperty.xml");
		
		Vegetable vegetable = context.getBean("vegetable", Vegetable.class); 
		Fruit fruit = context.getBean("fruit", Fruit.class); 
		System.out.println(vegetable.talkAboutMyself());
		System.out.println(fruit.talkAboutMyself());
		
		
		
	}

}
