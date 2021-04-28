package com.oca.datatypesoperatorsvariables.one;

class Test {

    public static void main(String[] args) {

        Test p = new Test();
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;
        p.updatePrice(prt, newPrice); // (prt, 100.0)
        System.out.println(prt.price + " : " + newPrice);
    }

    public void updatePrice(Product product, double price) {

        price = price * 2; // 100.0 * 2 = 200.0
        product.price = product.price + price; // 200.0 + 200.0 = 400.0
    }
}
