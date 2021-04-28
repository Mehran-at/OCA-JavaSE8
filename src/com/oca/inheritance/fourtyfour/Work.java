package com.oca.inheritance.fourtyfour;

/*INSERT*/
abstract class Work implements Workable {
//class Work implements Workable {
//abstract class Work {

    public void work() {

    } //Line n1
}
/*
And the statements:

1. abstract class Work implements Workable

2. class Work implements Workable

3. interface Work extends Workable

4. abstract interface Work extends Workable

5. abstract class Work
 */
/*
    INSERT cannot be replaced with interface as work() method at Line n1 is neither abstract nor default. Hence,
    statements 3 and 4 will not work.

        Let's check other statements:

        1. abstract class Work implements Workable: abstract class in java can have 0 or more abstract methods. It
        compiles successfully.

        2. class Work implements Workable: It correctly implements the work() method of Workable interface, hence it
        compiles successfully.

        5. abstract class Work: abstract class in java can have 0 or more abstract methods. It compiles successfully.

        Hence, out of 5 statements, 3 will compile successfully.
 */