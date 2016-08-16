package demo.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "demo.sb")
public class SpringbootH2JpaRestCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2JpaRestCrudDemoApplication.class, args);
	}
}
