package com.oca.methods.twentytwo;

class Test {

    public static void main(String[] args) {

        Report rep = new Report();
        String csv = rep.generateReport();
        Object xlsx = rep.generateReport();
        System.out.println(csv + " : " + (String) xlsx);
    }
}
/*
    Both the methods of Report class have same signature(name and parameters match).

    Having just different return types don't overload the methods and therefore Java compiler complains about duplicate
    generateReport() methods in Report class.
 */