package com.oca.constructor.eight;

class Study {

    String name;
    int age;

    Study() {

        this("David", 24);
        Study("Max", 26);
    }

    Study(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void Study(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return "Study{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}