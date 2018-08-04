package dh.umss.devops.demodevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemodevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodevopsApplication.class, args);
		System.out.println("<<<< Hola >>>>");
		System.out.println("<<<< Mundo >>>>");
	}
}
