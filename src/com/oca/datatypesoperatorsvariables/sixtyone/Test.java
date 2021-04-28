package com.oca.datatypesoperatorsvariables.sixtyone;

class Test {

    public static void main(String[] args) {

        String word = "REBUS";
        /* INSERT */
        System.out.println(word);
    }
}
/* 1 3 4
1. word = word.substring(2);

2. word = word.substring(2, 4);

3. word = word.substring(2, 5);

4. word = word.replace("RE", "");

5. word = word.substring(2, 6);

6. word = word.delete(0, 2);

 */
/*
    substring(int beginIndex, int endIndex) method of String class extracts the substring, which begins at the specified
    beginIndex and extends to the character at index endIndex - 1.

    This method throws IndexOutOfBoundsException if the beginIndex is negative, or endIndex is larger than the length of
    this String object, or beginIndex is larger than endIndex. e.g.

    "freeway".substring(4, 7) returns "way"

    "freeway".substring(4, 8) throws IndexOutOfBoundsException

    substring(int beginIndex) method of String class extracts the substring, which begins with the character at the
    specified index and extends to the end of this string.

    This method throws IndexOutOfBoundsException if beginIndex is negative or larger than the length of this String
    object. e.g.

    "freeway".substring(4) returns "way"

    "freeway".substring(8) throws IndexOutOfBoundsException

    replace(CharSequence target, CharSequence replacement) method of String class returns a new String object after
    replacing each substring of this string that matches the literal target sequence with the specified literal
    replacement sequence. e.g.

    "Java".replace("a", "A") --> returns new String object "JAvA".

    Let's check all the given options:

    1."REBUS".substring(2); [begin = 2, end = 4 (end of the string)], returns "BUS" and hence it is a correct option.

    2."REBUS".substring(2, 4); [begin = 2, end = 3 (endIndex - 1)], returns "BU" and hence it is incorrect option.

    3."REBUS".substring(2, 5); [begin = 2, end = 4 (endIndex - 1)], returns "BUS" and hence it is a correct option.

    4."REBUS".replace("RE", ""); It replaces "RE" with empty string "" and returns "BUS", so it is also a correct option.

    5."REBUS".substring(2, 6); Length of "REBUS" = 5 and endIndex = 6, which is greater than 5, hence it will thrown
    IndexOutOfBoundsException at runtime. Incorrect option

    6."REBUS".delete(0, 2); Compilation error as delete(...) method is not available in String class, it is part of
    StringBuilder class. Incorrect option.

    So, total 3 options will replace INSERT to print BUS on to the console.
 */