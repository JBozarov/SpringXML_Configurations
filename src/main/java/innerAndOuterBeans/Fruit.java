package innerAndOuterBeans;

public class Fruit {
	private String name; 
	private String description; 
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String talkAboutMyself() {
		return "I am Fruit and name is " + getName() + " and description is " + getDescription(); 
	}
}
