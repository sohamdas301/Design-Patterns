package Decorator;

public class Maharaja extends Burger{
    @Override
    public double cost() {
        return 200;
    }

    @Override
    public String description() {
        return "Maharaja Burger";
    }
}
