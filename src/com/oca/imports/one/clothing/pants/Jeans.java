package com.oca.imports.one.clothing.pants;

//import static com.oca.imports.one.clothing.Shirt.getColor;
import com.oca.imports.one.clothing.Shirt;

public class Jeans {

    //1    String color = getColor();
    String color = Shirt.getColor();

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }

    public void matchShirt() {
        if (color.equals("Green")) {
            System.out.println("matched Color");
        }
    }
}
