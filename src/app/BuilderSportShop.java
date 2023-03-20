package app;

import app.director.Director;
import app.shop.Shop;

public class BuilderSportShop {

    public static void main(String[] args) {

        Director builder = new Director();

        Shop orderA = builder.orderA();
        System.out.println("Sport-shop -> Cost A:");
        orderA.showProduct();
        System.out.println("Total Cost USD: " + orderA.getCost());

        Shop orderB = builder.orderB();
        System.out.println("\nSport-shop -> Cost B:");
        orderB.showProduct();
        System.out.println("Total Cost USD: " + orderB.getCost());
    }
}
