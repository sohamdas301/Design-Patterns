package AbstractFactory.Product;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }
}
