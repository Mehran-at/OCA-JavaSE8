package com.oca.methods.ten;

public class Person {

    String name;
    int age = 25;

    Person(String name) {
//        this();
        setName(name);
    }

    public Person(String name, int age) {
//        Person(name);
        new Person(name); // This constructor call, does not set name and name get the default value
        setAge(age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + '\'' + age;
    }
}
