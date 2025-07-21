package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo") // <-- это укажет Spring искать компоненты здесь
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Transport Mustang = new Car("Car", "Red", 8000, "Mustang", "AMV");
		Mustang.info();
	}


}
