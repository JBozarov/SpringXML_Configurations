package javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedConfig {

	@Bean(name = "komhoTire")
	public Tire getTireType () {
		return new Komho(); 
	}
	
	@Bean(name="volvoEngine")
	public Engine getEngineType() {
		return new VolvoEngine(); 
	}
}
