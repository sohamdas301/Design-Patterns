package AbstractFactory.Factories;

import AbstractFactory.Product.Gpu;
import AbstractFactory.Product.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
