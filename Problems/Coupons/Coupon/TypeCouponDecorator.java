package Problems.Coupons.Coupon;

import Problems.Coupons.Product.Product;
import Problems.Coupons.Product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator{
    Product product;
    ProductType productType;
    int disCountPercentage;
    static List<ProductType> eligibleProducts = new ArrayList<ProductType>();

    static {
        eligibleProducts.add(ProductType.ELECTRONIC_GOODS);
        eligibleProducts.add(ProductType.DECORATIVE_GOODS);
    }

    public TypeCouponDecorator(Product product, ProductType productType, int disCountPercentage) {
        this.product = product;
        this.productType = productType;
        this.disCountPercentage = disCountPercentage;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if(eligibleProducts.contains(productType)) {
            price = price - (price * disCountPercentage) / 100;
        }
        return price;
    }
}
