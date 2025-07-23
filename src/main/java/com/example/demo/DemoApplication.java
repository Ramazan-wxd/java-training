package com.example.demo;

import com.example.demo.training.ArrayMax;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void Boom(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ArrayMax.arrayMax();
	}


}
