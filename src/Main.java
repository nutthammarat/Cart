
import java.util.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        User user = UserService.getUser("user1");
        ArrayList<Cart> cart = null;
        cart = CartService.getAllProduct(user);
        if (cart.isEmpty()) {
            System.out.println("No product in cart");
        } else {
            int sum = 0;
            for (Cart e : cart) {
                sum += (e.getProduct().getPrice());
//                System.out.println(e.getProduct() + " " + e.getNum());
            
                arr.add(e.getProduct().toString());
            }
            for(int j = 0 ; j<arr.size();j++){
                System.out.println(arr.get(j)+ "");
            }
            System.out.println("Total Price is : " + sum);

        }
    
    }

}
