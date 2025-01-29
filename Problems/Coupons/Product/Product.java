package Problems.Coupons.Product;

import java.util.Date;

public abstract class Product {
     double price;
     String description;
     Date expiryDate;
     int quantity;
    private ProductType productType;

    public ProductType getProductType() {
        return productType;
    }

    public Product() {}
    public Product(double price, String description, Date expiryDate, int quantity,ProductType productType) {
        this.price = price;
        this.description = description;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.productType = productType;
    }
    public abstract double getPrice();

    public String getDescription() {
        return description;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }
}
