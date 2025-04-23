package FreshCoffee_Practice2;

import java.util.HashMap;
import java.util.Map;

public class Proj2OnlineShoppingCartSystem {

    public static void main(String[]args){

        //create products
        Product prod1 = new Product("Laptop", 999.99, 10);
        Product prod2 = new Product("Smartphone", 499.99, 20);

        //create shopping cart
        ShoppingCart cart1 = new ShoppingCart();

        cart1.addToCart(prod1, 2);
        cart1.addToCart(prod2, 1);

        //display cart and total price
        cart1.displayCart();
        //with .2f
        System.out.printf("Total Price : $%.2f\n", cart1.getTotalPrice());
    }
}

class Product{
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getStock(){return stock;}

    public void reduceStock(int quantity){
        if(stock>=quantity){
            stock -= quantity;
        }
    }

    public String toString(){
        return  name + " ($" + price + ")";
    }
}

class ShoppingCart{
    private Map<Product,Integer> cart = new HashMap<>();

//    public void addToCart(Product product, int quantity){
//        cart.put(product, cart.getOrDefault(product,0)+quantity);
//    }

    public void addToCart(Product product, int quantity){
        if(cart.containsKey(product)){
            //if product exist, add to existing quantity
            int currentQuantity = cart.get(product);
            cart.put(product, currentQuantity+quantity);
        }else {
            //if product not yet in cart, add with new quantity
            cart.put(product, quantity);
        }
    }

    public void removeFromCart(Product product){
        cart.remove(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cart.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice()*quantity;
        }
        return total;
    }

    public void displayCart(){
        System.out.println("Shopping Cart: ");
        for(Map.Entry<Product,Integer> entry : cart.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + " x" + quantity);
        }
    }
}
