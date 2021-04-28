package com.oca.arraysandarrayslist.ten;

import java.util.Arrays;

class Planet {

    public String name;
    public int moons;

    Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

//    @Override
//    public String toString() {
//
//        return "Planet{" + "name='" + name + '\'' + ", moons=" + moons + '}';
//    }

    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2),
        };
        System.out.println(planets); //  Arrays does not override toString method
//        System.out.println(Arrays.toString(planets));
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }
}
