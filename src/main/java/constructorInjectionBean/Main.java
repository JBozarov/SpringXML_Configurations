package constructorInjectionBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("constructorBeanConfig.xml");
		
		Meal meal = new Meal(); 
		System.out.println(meal.whatIsInTheMeal()); // Output is The Meal includes:
		
		Fruit fruit = context.getBean("fruit", Fruit.class); 
		Vegetable vegetable = context.getBean("vegetable", Vegetable.class);  
		Meal mealWithConstructorBean = context.getBean("meal", Meal.class);
		System.out.println(mealWithConstructorBean.whatIsInTheMeal());
		/* Output is: 
		The Meal includes: 
			 I am fruit
			 I am vege */
		 
		
	}

}
