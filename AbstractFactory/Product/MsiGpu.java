package AbstractFactory.Product;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Gpu");
    }
}
