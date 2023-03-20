package app.builders;

public class CapBlack implements Product {

    @Override
    public float price() {
        return 34.9f;
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
        return "Black";
    }
}
