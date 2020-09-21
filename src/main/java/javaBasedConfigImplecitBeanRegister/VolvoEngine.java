package javaBasedConfigImplecitBeanRegister;

import org.springframework.stereotype.Component;

@Component
public class VolvoEngine implements Engine {

	public String getEngineType() {
		return "Engine type is Volvo";
	}

}
