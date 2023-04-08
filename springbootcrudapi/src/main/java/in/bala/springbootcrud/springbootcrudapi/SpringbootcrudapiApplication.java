package in.bala.springbootcrud.springbootcrudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class SpringbootcrudapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudapiApplication.class, args);
	}

}
