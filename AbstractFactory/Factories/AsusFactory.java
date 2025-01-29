package AbstractFactory.Factories;

import AbstractFactory.Product.AsusGpu;
import AbstractFactory.Product.AsusMonitor;
import AbstractFactory.Product.Gpu;
import AbstractFactory.Product.Monitor;

public class AsusFactory extends Company{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
