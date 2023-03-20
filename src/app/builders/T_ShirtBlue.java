package app.builders;

public class T_ShirtBlue implements Product {

    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String maker() {
        return "Active sports";
    }

       @Override
    public String name() {
        return "t-shirt";
    }

    @Override
    public String color() {
        return "Blue";
    }
}
