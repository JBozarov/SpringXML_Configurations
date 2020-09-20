package setterBeanConfig;

public class Meal {
	private Vegetable vegetable;
	private Fruit fruit;
	
	public Vegetable getVegetable() {
		return vegetable;
	}
	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public String whatIsInTheMeal () {
		String answer = "The Meal includes: ";
		if (fruit != null) {
			answer += "\n I am fruit"; 
		}
		if (vegetable != null) {
			answer += "\n I am vege"; 
		}
		return answer; 
	}
}
