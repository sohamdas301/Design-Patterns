package Problems.Coupons.Product;

import java.util.Date;

public class Mobile extends Product{
    private String model;
    public Mobile(double price, String description, Date expiryDate, int quantity, String model,ProductType productType) {
        super(price, description, expiryDate, quantity, productType);
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
