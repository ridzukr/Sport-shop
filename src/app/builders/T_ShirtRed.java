package app.builders;


public class T_ShirtRed implements Product {

    @Override
    public float price() {
        return 51.8f;
    }

    @Override
    public String name() {
        return "t-shirt";
    }

    @Override
    public String maker() {
        return "Active sports";
    }

    @Override
    public String color() {
        return "Red";
    }
}
