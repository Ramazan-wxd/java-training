package com.example.demo.training.AvgScoreStudent;

abstract class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public abstract String describe();
}
Interface Evaluatable(){
    double evaluate();
}
class Student extends Person{
    int[] grade;
    public Student(String name, int age, int[] grade){
        super(name, age);
        this.grade = grade;
    }
}

