package com.oca.datatypesoperatorsvariables.thirtysix;

class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("SpaceStation");
        StringBuilder delete = sb.delete(5, 6);/* "Spacetation" */
        System.out.println(delete); /* "Spacetation" */
        System.out.println(sb); /* "SpaceStation" */
        StringBuilder insert = delete.insert(5, " S"); /* "Space Station" */
        System.out.println(insert); /* "Space Station" */
        insert.toString().toUpperCase(); /* This does not change anything as it create a new String that was not assigned */
        System.out.println(sb); /* "SpaceStation" */

        System.out.println("\n");
        StringBuilder newSb = new StringBuilder("SpaceStation");
        newSb.delete(5, 6).insert(5, " S").toString().toUpperCase(); /* Space Station */
        System.out.println(newSb + "\n");
    }
}
/*
    sb - > "SpaceStation"

    sb.delete(5, 6) -> "Spacetation"

    sb.insert(5, " S") -> "Space Station"

    sb.toString() -> Creates a new String object "Space Station"

    "Space Station".toUpperCase() -> Creates another String object "SPACE STATION" but the String object is not referred
    and used.

    Method invocation on sb modifies the same object, so after insert(5, " S") method invocation sb refers to
    "Space Station" and this is printed to the Console.
 */