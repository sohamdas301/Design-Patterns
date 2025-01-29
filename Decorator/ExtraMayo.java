package Decorator;

public class ExtraMayo extends BurgerDecorator{
    Burger burger;

    public ExtraMayo(Burger burger) {
        this.burger = burger;
    }
    @Override
    public double cost() {
        return burger.cost() + 10;
    }

    @Override
    public String description() {
        return burger.description() + " with extra Mayo";
    }
}
