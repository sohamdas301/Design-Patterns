package Decorator;

public class Zinger extends Burger{
    @Override
    public double cost() {
        return 180;
    }

    @Override
    public String description() {
        return "Zinger Burger";
    }
}
