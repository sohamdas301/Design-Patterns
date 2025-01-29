package Problems.Coupons.Cart;

import Problems.Coupons.Coupon.PercentageCouponDecorator;
import Problems.Coupons.Coupon.TypeCouponDecorator;
import Problems.Coupons.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;
    private double totalPrice;

    public Cart() {
        items = new ArrayList<>();
    }
    public void addItem(Product product) {
        Product modifiedProduct = new TypeCouponDecorator(new PercentageCouponDecorator(product,10),
                                                           product.getProductType(),
                                            5);
        totalPrice += modifiedProduct.getPrice();
        items.add(product);
    }
    public void removeItem(Product product) {
        Product modifiedProduct = new TypeCouponDecorator(new PercentageCouponDecorator(product,10),
                product.getProductType(),
                5);
        totalPrice -= modifiedProduct.getPrice();
        items.remove(product);
    }
    public double calculatePrice() {
        return totalPrice;
    }
}
