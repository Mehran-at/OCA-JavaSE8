package com.oca.inheritance.eight;

class Main {

    /* so we have these members in every
            . employee salary
            . manager budget
            . director stockOption
     */
    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        employee.salary = 50_000;
//        employee.budget = 200_000;    cannot access instance variable in child class
//        employee.stockOption = 500;   cannot access instance variable in child class

        manager.budget = 1_000_000;
        manager.salary = 1_000_000;
//        manager.stockOption = 0;      cannot access instance variable in child class

        director.stockOption = 1_000;
        director.budget = 900_000;
        director.salary = 80_000;
        /* and here we start to play with Polymorphism concepts. */
        Employee employeeManager = new Manager();
        int salary = employeeManager.salary;
        System.out.println(salary);

        Employee employeeDirector = new Director();
        int salary1 = employeeDirector.salary;
        System.out.println(salary1);

        Manager managerDirector = new Director();
        int budget = managerDirector.budget;
        int salary2 = managerDirector.salary; // As manager extends employee, it inherits its members and in this case salary variable.
        System.out.println(budget + salary2);

//        Director directorManager = new Manager(); /* cause compilation error as subtype cannot refer to supertype */
//        Manager managerEmployee = new Employee(); /* cause compilation error as subtype cannot refer to supertype */
    }
}