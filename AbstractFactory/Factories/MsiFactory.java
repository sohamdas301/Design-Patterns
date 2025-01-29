package AbstractFactory.Factories;

import AbstractFactory.Product.Gpu;
import AbstractFactory.Product.Monitor;
import AbstractFactory.Product.MsiGpu;
import AbstractFactory.Product.MsiMonitor;

public class MsiFactory extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
