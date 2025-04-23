package OOP_CollectionGPTPractice;

import java.util.HashMap;
import java.util.Map;

public class Ex2LShoppingCart {

    public static void main(String[]args){

        Product prod1 = new Product("F001","Office Chair", 200);
        Product prod2 = new Product("F002", "Office Desk", 300);
        Product prod3 = new Product("F003", "Office Table", 400);
        Product prod4 = new Product("F004", "Office Cabinet", 500);
        Product prod5 = new Product("F005", "Office Bookshelf", 600);

        Cart cart1 = new Cart();
        cart1.addProduct(prod1,4);
        cart1.addProduct(prod3,2);
        cart1.addProduct(prod4,1);
        cart1.addProduct(prod5, 3);
        cart1.displayCart();

        System.out.println();
        Cart cart2 = new Cart();
        cart2.addProduct(prod2,10);
        cart2.displayCart();

    }
}

class Product{
    private String id,name;
    private double price;

    public double getPrice(){return price;}

    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return name +
                ", price with $" + price;
    }

}

class Cart{
    private Map<Product,Integer> cart = new HashMap<>();

    void addProduct(Product prod, Integer quantity){
        cart.put(prod, cart.getOrDefault(prod,0)+quantity);
    }

    void displayCart(){
        System.out.println("Products Inside the Cart are : ");
        for(Map.Entry<Product,Integer> entry : cart.entrySet()){
            Product prod = entry.getKey();
            int quantity = entry.getValue();

            double subtotal = prod.getPrice()*quantity;
            System.out.println(" There are "+quantity+" of "+"subtotal amount is $"+subtotal);
        }
    }

}
