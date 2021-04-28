package com.oca.classdefinition.three;

public class Exam {

    public static void main(String[] args) {

        System.out.println("Death Magnetic");
    }
}
/*
    Location of files:

    D:.
    └───WORK
        └───QUIZ
            └───SEC07
                ├───classes
                │   └───com
                │       └───oca
                │           └───classdefinition.three
                │                   Exam.class
                │
                └───src
                    └───com
                        └───classdefinition.three
                            └───test
                                    Exam.java
    You are currently at WORK folder.

    D:\WORK>

    Which java command will print Death Magnetic on to the console?
 */
/*
    To execute Exam class from WORK folder, you should specify the classpath (Quiz\Sec07\classes\) which contains whole
    path of the class(com\oca\classdefinition\three\Exam.class).

    And you should also use fully qualified name of the class, which is com.oca.test.Exam.

    Hence correct option is: java -cp Quiz\Sec07\classes\ com.oca.classdefinition.three.Exam
 */