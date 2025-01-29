package Problems.Coupons.Product;

import java.util.Date;

public class TShirt extends Product{
    private int tShirtSize;
    public TShirt(double price, String description, Date expiryDate, int quantity, int tShirtSize, ProductType productType) {
        super(price, description, expiryDate, quantity, productType);
        this.tShirtSize = tShirtSize;
    }

    public int gettShirtSize() {
        return tShirtSize;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
