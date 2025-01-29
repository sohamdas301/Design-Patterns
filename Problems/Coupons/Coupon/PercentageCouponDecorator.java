package Problems.Coupons.Coupon;

import Problems.Coupons.Product.Product;

public class PercentageCouponDecorator extends CouponDecorator{
    Product product;
    int discountPercentage;
    public PercentageCouponDecorator(Product product,int discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        return price - (price * discountPercentage) / 100;
    }
}
