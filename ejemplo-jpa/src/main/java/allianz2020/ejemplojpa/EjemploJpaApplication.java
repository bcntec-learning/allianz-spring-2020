package allianz2020.ejemplojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EntityScan
@EnableWebMvc
@SpringBootApplication
public class EjemploJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploJpaApplication.class, args);
	}

}
