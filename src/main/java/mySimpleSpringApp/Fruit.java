package mySimpleSpringApp;

import java.util.List;
import java.util.Map;

public class Fruit {

	private List<String> fruitNameList; 
	private Map<String, String> fruitNameMap; 
	
	public Fruit() {
	}
	
	
	public List<String> getFruitNameList() {
		return fruitNameList;
	}


	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}


	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}


	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}


	public String talkAboutYourself() {
		String speech = "Hi I am a fruit. I come from plants"; 
		if (fruitNameList != null && fruitNameList.size()>0) {
			speech += "\nList : ";
			for (int i = 0; i<fruitNameList.size(); i++ ) {
				speech += ". name: " + fruitNameList.get(i);
			}
		}
		
		if (fruitNameMap != null && fruitNameMap.size()>0) {
			speech += "\nMap: "; 
			for(Map.Entry<String, String> fruitName : fruitNameMap.entrySet()) {
				speech += fruitName.getKey() + " ==> " + fruitName.getValue() + " :: ";
			}
		}
		return speech; 
	}
}
