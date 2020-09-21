package initAndDestroyMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("initAndDestroy.xml");
		
		SimpleClass simpleClass = new SimpleClass(); 
		//System.out.println(simpleClass.talkAboutMyself());
		
		SimpleClass simpleClassWithBean = context.getBean("simple", SimpleClass.class); 
		System.out.println(simpleClassWithBean.talkAboutMyself());
	}

}
