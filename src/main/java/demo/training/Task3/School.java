package demo.training.Task3;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student a = new Student("Ramazan", 17, new double[]{4.9, 4.2, 4.6, 4.3});
        Student b = new Student("Miras", 18, new double[]{4.4, 4.8, 5.0, 4.0});
        Student c = new Student("Bekzhigit", 15, new double[]{4.3, 4.2, 4.7, 3.9});
        Student d = new Student("Alnur", 17, new double[]{4.0, 4.4, 4.9, 4.2});

        Teacher A = new Teacher("Nauryzbay", 30, "Programming");
        Teacher B = new Teacher("Elaman", 26, "Tennis");
        Person[] persons = new Person[]{a, b, A, d, c, B};
        for (Person i : persons) {
            if (i.getClass() == Student.class) {
                System.out.println(i.describe());
                System.out.println("Оценка: " + ((Student) i).evaluate());
                if (((Student) i).evaluate() >= 4.5) {
                    System.out.println("Отличник\n");
                } else {
                    System.out.println("Не отличник\n");
                }
            } else {
                System.out.println(i.describe());
                System.out.println(" ");
            }
        }
    }
}


abstract class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public abstract String describe();
}

interface Evaluatable {

    double evaluate();
}

class Student extends Person implements Evaluatable {
    private double[] grade;

    public Student(String name, int age, double[] grade) {
        super(name, age);
        this.grade = grade;
    }

    public double evaluate() {
        return Arrays.stream(grade).average().orElse(0);
    }

    public String describe() {
        return "Имя " + getName() + ", возраст " + getAge();
    }
}

class Teacher extends Person {
    public String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String describe() {
        return "Имя " + getName() + ", предмет " + subject;
    }

}



