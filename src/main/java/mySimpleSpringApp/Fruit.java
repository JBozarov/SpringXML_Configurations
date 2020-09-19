package mySimpleSpringApp;

public class Fruit {

	private String myName; 
	
	public Fruit () {
	}
	
	public Fruit(String myName) {
		this.myName = myName;
	}

	
	public String talkAboutYourself() {
		String speech = "Hi I am a fruit"; 
		if (myName != null || myName != "") {
			speech += " and my name is " + myName; 
		}
		return speech; 
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	

}
