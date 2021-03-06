package autowireByType;

public class Meal {
	private Fruit fruit;
	private Vegetable vegetable;

	public Meal () {	
	}


	public Meal(Fruit fruit, Vegetable vegetable) {
		super();
		this.fruit = fruit;
		this.vegetable = vegetable;
	}


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
			answer += fruit.talkAboutMyself(); 
		}
		if (vegetable != null) {
			answer += vegetable.talkAboutMyself(); 
		}
		return answer; 
	}
}
