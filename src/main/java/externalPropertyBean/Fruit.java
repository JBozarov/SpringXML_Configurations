package externalPropertyBean;

public class Fruit {
	private String definition = "not set";

	public Fruit () {
		
	}
	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String talkAboutMyself () {
		return "Definition is: " + definition; 
	}
	
}
