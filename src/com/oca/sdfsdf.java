package com.oca;

import java.util.ArrayList;
import java.util.List;

interface HenHouse {

    public java.util.List<Chicken> getChickens();
}

class Chicken implements HenHouse {

    @Override
    public List<Chicken> getChickens() {

        List<Chicken> h = new ArrayList<>(2);
        h.add(new Chicken());
        h.add(new Chicken());
        return h;
    }
}

class ChickenSong {

    public static void main(String[] args) {

        HenHouse house = new Chicken();

        Chicken chicken = house.getChickens().get(0);

        for (int i = 0 ; i < house.getChickens().size() ; chicken = house.getChickens().get(i++)) {
            System.out.println(house.getChickens().toString());
            System.out.println("Cluck");
        }
    }
}
