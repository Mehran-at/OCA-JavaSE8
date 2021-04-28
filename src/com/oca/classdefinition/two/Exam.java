package com.oca.classdefinition.two;

class Exam {

    public static void main(String[] args) {

        System.out.println("The Unforgiven");
    }
}
/*
    Location of Exam.java file:

    D:.
    └───WORK
        └───QUIZ
            └───SEC07
                ├───classes
                └───src
                    └───com
                        └───x
                            └───test
                                    Exam.java
    You are currently at Sec07 folder.
    D:\WORK\Quiz\Sec07>

    Which of the following javac command, typed from above location, will generate Exam.class file structure under
    classes directory?

    D:.
    └───WORK
        └───QUIZ
            └───SEC07
                ├───classes
                │   └───com
                │       └───x
                │           └───test
                │                   Exam.class
                │
                └───src
                    └───com
                        └───x
                            └───test
                                    Exam.java
 */
//  javac -d classes\src\com\x\test\Exam.java

//  Use -d option with javac command. As you are typing javac command from within Sec07 directory, hence path of java
//  file relative to Sec07 directory needs to be given.

//  So, correct command is: javac -d classes\ src\com\x\test\Exam.java