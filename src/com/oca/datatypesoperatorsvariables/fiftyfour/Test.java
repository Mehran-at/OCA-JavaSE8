package com.oca.datatypesoperatorsvariables.fiftyfour;

class Test {

    public static void main(String[] args) {

        /* private */
        final Article article = new Article("OCA Java", "BBW");
        System.out.println(article.getName());
        System.out.println(article.getAuthor());
    }
}
/*
    Variable 'article' in main(String[]) method of Test class cannot be declared private as it is a local variable.
    Hence, there is a compilation error in TestBook class. After solving that problem, pay attention that overloaded
    constructor in Article assign author parameter to itself not to class variable Author. Hence article.getAuthor()
    is null and print null.

    Only final modifier can be used with local variables.
 */