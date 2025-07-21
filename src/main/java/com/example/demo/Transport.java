package com.example.demo;

public class Transport {
    public String type;
    public String color;
    public int cost;
    public Transport(String type, String color, int cost){
        this.type = type;
        this.color = color;
        this.cost = cost;
    }
    public void info(){
        System.out.println("Transport: " + color + " " + type + " for " + cost + " dollars");
    }
}
class Car extends Transport {
    String mark;
    String model;

    public Car(String type, String color, int cost, String mark, String model){
        super(type, color, cost);
        this.mark = mark;
        this.model = model;
    }
    public void info(){
        super.info();
        System.out.println("Car: " + mark + " " + model);
    }
}

