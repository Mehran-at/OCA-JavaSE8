package com.oca.arraysandarrayslist.sixtysix;

class Test {

    public static void main(String[] args) {

        String[] arr = {"1st", "2nd", "3rd", "4th", "5th"};
        String place = "castaway";
        System.out.println(arr[place.indexOf("a", 4)]); /*Line n1.  String index of method gets two
        parameters (String object, int) the second parameter is the index number, from which this method starts to look
        for the equal string objects. */
    }
}
/*
    `int indexOf(String str, int fromIndex)` method of String class returns the index within this string of the
    first occurrence of the specified substring, starting at the specified index. e.g.

    "alaska".indexOf("a", 1) returns 2

    "alaska".indexOf("a", 2) returns 2

    "alaska".indexOf("a", 3) returns 5

    In the given question, 'arr' refers to a String array of size 5. Element at index 0 refers to "1st", element at
    index 1 refers to "2nd" and so on.

    Let's solve the given expression of Line n1:

    arr[place.indexOf("a", 3)]

    = arr["castaway".indexOf("a", 3)] //Starts looking for "a" from index 3 of the given String "castaway" and "a" is
    found at index 3.

    = arr[3]

    = "4th" //Array element at index 3 refers to "4th".

    Hence, 4th is printed on to the console.
 */