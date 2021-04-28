package com.oca.datatypesoperatorsvariables.four;

class Test {

    public static void main(String[] args) {

        Student student = new Student("James", 25); /* we create an object of Student class here. And all the
         rest of processes perform on this object. */
        int marks = 25;
        System.out.println(student.marks);
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student stud, int marks) {

        marks = marks + 10;
        stud.marks += marks;
    }
}
