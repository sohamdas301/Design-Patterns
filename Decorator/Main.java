package Decorator;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Zinger();
        System.out.println(burger.description() + " " + burger.cost());
        burger = new ExtraCheese(burger);
        System.out.println(burger.description() + " " + burger.cost());
        burger = new ExtraMayo(burger);
        System.out.println(burger.description() + " " + burger.cost());
    }
}
