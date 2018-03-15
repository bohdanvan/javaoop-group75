package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {

    public static void main(String[] args) {
        Person p1 = new Person("Vlad", 30);
        p1.sayHello();

        Person p2 = new Person();
        p2.sayHello();

        Developer d = new Developer("Ivan", 25, "Google");
        d.sayHello();
        d.writeCode();

        Person p3 = new Developer("Masha", 27, "Amazon");
        p3.sayHello();
    }
}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("unnamed", 0);
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    protected String getName() {
        return name;
    }
}

class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public Developer() {
        super();
        this.company = "-";
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm " + getName() + " from " + company);
        super.sayHello();
    }

    public void writeCode() {
        System.out.println("Coding... I work at " + company);
    }
}
