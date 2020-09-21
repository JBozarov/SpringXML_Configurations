package javaBasedConfigImplecitBeanRegister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaBasedConfigImplecitBeanRegister")
public class JavaBasedConfig {

	@Bean(name = "komhoTire")
	public Tire getTireType () {
		return new Komho(); 
	}
	
}
