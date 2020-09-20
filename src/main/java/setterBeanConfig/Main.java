package setterBeanConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("setterBeanConfig.xml");
		
		Fruit fruit = context.getBean("fruitSetter", Fruit.class); 
		Vegetable vegetable = context.getBean("vegetableSetter", Vegetable.class); 
		Meal meal = context.getBean("mealSetter", Meal.class); 
		System.out.println(meal.whatIsInTheMeal());
	}

}
