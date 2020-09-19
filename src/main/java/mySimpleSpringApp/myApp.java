package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {

//		Fruit fruit = new Fruit(); 
//		Vegetable vegetable = new Vegetable(); 
		
		// FileSystemXmlApplicationContext sees xml in entire project
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		
		// if we moved xml file in the package we need to use ClassPathXmlApplicationContext:
		// ApplicationContext context = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		Fruit fruit = context.getBean("fruit", Fruit.class); 
		Vegetable vegetable = (Vegetable) context.getBean("vegetable");
		
		System.out.println(fruit.talkAboutYourself());
		System.out.println(vegetable.talkAboutYourself());
		
		Fruit myOtherFruit = context.getBean("fruitWithName", Fruit.class); 
		System.out.println(myOtherFruit.talkAboutYourself());
	}

}
