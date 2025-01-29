package Test;

import java.util.ArrayList;
import java.util.List;

// CouponStrategy interface for applying coupons
interface CouponStrategy {
    double applyCoupon(double total, Product product);
}

// Concrete implementation for percentage discount coupon
class PercentageOffCoupon implements CouponStrategy {
    private double discountPercentage;

    public PercentageOffCoupon(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyCoupon(double total, Product product) {
        return total * (100 - discountPercentage) / 100;
    }
}

// Concrete implementation for discount on next item coupon
class NextItemOffCoupon implements CouponStrategy {
    private double discountPercentage;

    public NextItemOffCoupon(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyCoupon(double total, Product product) {
        return total - (product.getPrice() * discountPercentage / 100);
    }
}

// Concrete implementation for discount on Nth item of type coupon
class NthItemOfTypeOffCoupon implements CouponStrategy {
    private double discountPercentage;
    private int nthItem;
    private String itemType;

    public NthItemOfTypeOffCoupon(double discountPercentage, int nthItem, String itemType) {
        this.discountPercentage = discountPercentage;
        this.nthItem = nthItem;
        this.itemType = itemType;
    }

    @Override
    public double applyCoupon(double total, Product product) {
        return total - (product.getPrice() * discountPercentage / 100);
    }
}

// Product class
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Coupon class with Builder pattern
class Coupon {
    private CouponStrategy couponStrategy;

    private Coupon(CouponStrategy couponStrategy) {
        this.couponStrategy = couponStrategy;
    }

    public double applyCoupon(double total, Product product) {
        return couponStrategy.applyCoupon(total, product);
    }

    // Builder for creating percentage discount coupon
    public static class PercentageOffCouponBuilder {
        private double discountPercentage;

        public PercentageOffCouponBuilder(double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public Coupon build() {
            return new Coupon(new PercentageOffCoupon(discountPercentage));
        }
    }

    // Builder for creating discount on next item coupon
    public static class NextItemOffCouponBuilder {
        private double discountPercentage;

        public NextItemOffCouponBuilder(double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public Coupon build() {
            return new Coupon(new NextItemOffCoupon(discountPercentage));
        }
    }

    // Builder for creating discount on Nth item of type coupon
    public static class NthItemOfTypeOffCouponBuilder {
        private double discountPercentage;
        private int nthItem;
        private String itemType;

        public NthItemOfTypeOffCouponBuilder(double discountPercentage, int nthItem, String itemType) {
            this.discountPercentage = discountPercentage;
            this.nthItem = nthItem;
            this.itemType = itemType;
        }

        public Coupon build() {
            return new Coupon(new NthItemOfTypeOffCoupon(discountPercentage, nthItem, itemType));
        }
    }
}

// ShoppingCart class
class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private List<Coupon> coupons = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void applyCoupon(Coupon coupon) {
        coupons.add(coupon);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }

        for (Coupon coupon : coupons) {
            for (Product product : products) {
                total = coupon.applyCoupon(total, product);
            }
        }

        return total;
    }
}

public class TestClass {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Product 1", 10.0, 2);
        Product product2 = new Product("Product 2", 20.0, 1);

        // Creating coupons using Builder pattern
        Coupon coupon1 = new Coupon.PercentageOffCouponBuilder(10.0).build();
        Coupon coupon2 = new Coupon.NextItemOffCouponBuilder(50.0).build();
        Coupon coupon3 = new Coupon.NthItemOfTypeOffCouponBuilder(20.0, 2, "Product 1").build();

        // Creating shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Applying coupons to the cart
        cart.applyCoupon(coupon1);
        cart.applyCoupon(coupon2);
        cart.applyCoupon(coupon3);

        // Calculating total amount after discounts
        double totalAmount = cart.calculateTotal();
        System.out.println("Total amount after discounts: $" + totalAmount);
    }
}

