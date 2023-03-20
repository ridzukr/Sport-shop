package app.director;

import app.builders.CapBlack;
import app.builders.CapWhite;
import app.builders.T_ShirtBlue;
import app.builders.T_ShirtRed;
import app.shop.Shop;

public class Director {

    public Shop orderA() {
        Shop shop = new Shop();
        shop.addProduct(new T_ShirtRed());
        shop.addProduct(new CapWhite());
        return shop;
    }

    public Shop orderB() {
        Shop shop = new Shop();
        shop.addProduct(new T_ShirtBlue());
        shop.addProduct(new CapBlack());
        return shop;
    }
}
