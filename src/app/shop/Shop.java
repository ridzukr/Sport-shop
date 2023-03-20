package app.shop;

import app.builders.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Shop {

    List<Product> items = new ArrayList<>();

    public void addProduct(Product item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Product item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showProduct() {

        AtomicInteger i = new AtomicInteger(1);

        for (Product item : items) {
            System.out.print("Item " + i.getAndIncrement() + ": " + item.color() + " " + item.name());
            System.out.print("; Maker: " + item.maker());
            System.out.println("; Price USD: " + item.price());
        }
    }
}
