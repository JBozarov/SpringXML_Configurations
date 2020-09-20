package mySimpleSpringApp;

public class Vegetable {
	
	private String myName; 
	public Vegetable() {
		
	}
	
	public Vegetable(String myName) {
		this.myName = myName; 
	}
	
	
	public String talkAboutYourself() {
		String speech = "Hi I am a Vegetable"; 
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
