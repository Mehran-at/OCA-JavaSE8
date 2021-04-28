package com.oca.objectequality.one;

class Student {

    private String name;
    private int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String toString() {

        return "Student[" + name + ", " + age + "]";
    }
}
