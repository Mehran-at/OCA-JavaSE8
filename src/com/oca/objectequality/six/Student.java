package com.oca.objectequality.six;

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

    public boolean equals(Student obj) {

        if (obj instanceof Student) {
            Student stud = (Student) obj;
            if (this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}
