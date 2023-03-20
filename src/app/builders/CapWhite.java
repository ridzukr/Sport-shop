package app.builders;


public class CapWhite implements Product {

    @Override
    public float price() {
        return 32.4f;
    }

    @Override
    public String name() {
        return "cap";
    }

    @Override
    public String maker() {
        return "Smart caps";
    }

    @Override
    public String color() {
        return "White";
    }
}
