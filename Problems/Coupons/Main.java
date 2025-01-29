package Problems.Coupons;

import Problems.Coupons.Cart.Cart;
import Problems.Coupons.Product.Mobile;
import Problems.Coupons.Product.Product;
import Problems.Coupons.Product.ProductType;
import Problems.Coupons.Product.TShirt;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product1 = new TShirt(1000,"XXL",new Date(2023,12,25),1,32, ProductType.LIFESTYLE_GOODS);
        Product product2 = new Mobile(3000,"Nokia",new Date(2024,12,6),1,"Lumia",ProductType.ELECTRONIC_GOODS);
        cart.addItem(product1);
        cart.addItem(product2);
        System.out.println(cart.calculatePrice());
    }
}
