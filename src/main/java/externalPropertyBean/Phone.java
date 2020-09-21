package externalPropertyBean;

public class Phone {
	private String name = "Samsung Galaxy";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String talkAboutMyself () {
		return name; 
	}
	
}
