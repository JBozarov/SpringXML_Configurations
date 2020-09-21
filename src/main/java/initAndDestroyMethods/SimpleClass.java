package initAndDestroyMethods;

public class SimpleClass {
	
	private String description; 
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String talkAboutMyself() {
		return "Hi I am a Simple Class"; 
	}
	
	public String initMethod () {
		System.out.println("init called");
		return "Hi I am a init method"; 
	}
	
	public String destroyMethod () {
		System.out.println("destroy called");
		return "Hi I am a destroy method"; 
	}
}
