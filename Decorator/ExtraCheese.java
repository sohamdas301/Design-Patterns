package Decorator;

public class ExtraCheese extends BurgerDecorator{
    Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }
    @Override
    public double cost() {
        return burger.cost() + 20;
    }

    @Override
    public String description() {
        return burger.description() + " with extra Cheese";
    }
}
