import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;

public class CartService {
    public static ArrayList<Cart> getAllProduct(User user){
        return CartDao.getAllProductCart(user);
    }

    public static boolean addToCart(User user,Product product,int num){
        return CartDao.addCart(user,product,num);
    }
    
    public static void showList(){
        User user = UserService.getUser("user1");
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<Cart> list = CartService.getAllProduct(user);
        
        for(Cart e : list)
            listModel.addElement(e.toString());
        CartPage.list1.setModel(listModel);

    }
    public static void deleteProduct(String id){
        User user = UserService.getUser("user1");
       CartDao.deleteProduct(user,ProductService.getProduct(id));
       showList();
    }

   
}