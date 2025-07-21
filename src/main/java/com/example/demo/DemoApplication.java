package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) {

		Car MyMustang = new Car("Car", "Red", 8000, "Mustang", "AMV");
		MyMustang.info();
		MyMustang.recolor("Black");
		MyMustang.info();
	}


}
