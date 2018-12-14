
import java.util.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        User user = UserService.getUser("user1");
        ArrayList<Cart> cart = null;
        cart = CartService.getAllProduct(user);
        if (cart == null) {
            System.out.println("No product in cart");
        } else {
            int sum = 0;
            for (Cart e : cart) {
                sum += (e.getProduct().getPrice());
                System.out.println(e.getProduct() + " " + e.getNum());
            }
            System.out.println("Total Price is : " + sum);

        }
    
    }

}
