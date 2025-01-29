package AbstractFactory;

import AbstractFactory.Factories.AsusFactory;
import AbstractFactory.Factories.Company;
import AbstractFactory.Factories.MsiFactory;
import AbstractFactory.Product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company msi = new MsiFactory();
        Company asus = new AsusFactory();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);
    }
}
