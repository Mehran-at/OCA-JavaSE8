package com.oca.objectequality.four;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 28));
        students.add(new Student("James", 29));

        students.remove(new Student("James", 25));

        for (Student stud : students) {
            System.out.println(stud);
        }
    }
}
