package AbstractFactory.Product;

public class AsusMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS Monitor");
    }
}
