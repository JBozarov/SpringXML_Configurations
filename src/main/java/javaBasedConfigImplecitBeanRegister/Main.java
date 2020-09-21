package javaBasedConfigImplecitBeanRegister;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		
		VolvoEngine volvoEngine =  context.getBean(VolvoEngine.class); 
		System.out.println(volvoEngine.getEngineType());
		
		Komho komhoTire = context.getBean("komhoTire", Komho.class); 
		System.out.println(komhoTire.getTireType());
		
		
	}

}
