package com.oca.inheritance.seventytwo;

class Test {

    private double length;
    private double height;
    private double area;

    public void setLength(double length) {

        this.length = length;
        setArea(area);
    }

    public void setHeight(double height) {

        this.height = height; // height = 12.0
        setArea(area);
    }

    public void setArea(double area) {

        this.area = length * height;
    } // area = 0.0 * 12.0 = 0.0

    public static void main(String[] args) {

        Test rectangle = new Test();
        rectangle.setHeight(12);
        System.out.println(rectangle.area);
    }
}
