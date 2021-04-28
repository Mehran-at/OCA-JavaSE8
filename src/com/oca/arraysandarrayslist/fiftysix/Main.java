package com.oca.arraysandarrayslist.fiftysix;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

//        List<A> list = new ArrayList<B>();
        List<A> list = new ArrayList<A>();
        list.add(0, new B());
//        list.add(0, new A());
        System.out.println(list.size() > 0);
    }
}
/*r
    List is super type and ArrayList is sub type, hence List l = new ArrayList(); is valid syntax.

    A is super type and B is sub type, hence A a = new B(); is valid syntax. Both depicts Polymorphism.

    But in generics syntax, Parameterized types are not polymorphic, this means ArrayList<A> is not super type of
    ArrayList<B>. Remember this point. So below syntax are not allowed:

    ArrayList<A> list = new ArrayList<B>();
    OR
    List<A> list = new ArrayList<B>();
 */