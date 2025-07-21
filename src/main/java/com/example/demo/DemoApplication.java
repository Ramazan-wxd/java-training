package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Car MyMustang = new Car("Car", "Red", 8000, "Mustang", "AMV");
		MyMustang.info();
		MyMustang.recolor("Black");
		MyMustang.info();
		calculator.calculate();
	}


}
