package OOP_CollectionGPTPractice;

import java.util.*;

public class Ex4InventoryByCategory {

    public static void main(String[]args){

        Inventory inventory = new Inventory();

        inventory.addItem("Electronics", new Item("Laptop", 1000, 10));
        inventory.addItem("Electronics", new Item("Phone", 500, 20));
        inventory.addItem("Clothing", new Item("Shirt", 50, 50));
        inventory.addItem("Clothing", new Item("Pants", 80, 30));
        inventory.addItem("Books", new Item("Java Programming", 30, 15));
        inventory.addItem("Books", new Item("Python Programming", 25, 20));

        List<Item> electronics = inventory.getItemsByCategoty("Electronics");
        System.out.println("Electronics: ");
        for(Item item : electronics){
            System.out.println(item.getName() +" - "+ item.getPrice() +"$ - "+ item.getStock()+" stocks.");
        }
        System.out.println();
        List<Item> clothing = inventory.getItemsByCategoty("Clothing");
        System.out.println("Clothing: ");
        for(Item item : clothing){
            System.out.println(item.getName() +" - "+ item.getPrice() +"$ - "+ item.getStock()+" stocks.");
        }
        System.out.println();
        List<Item> books = inventory.getItemsByCategoty("Books");
        System.out.println("Books: ");
        for(Item item : books){
            System.out.println(item.getName() +" - "+ item.getPrice() +"$ - "+ item.getStock()+" stocks.");
        }

    }
}

class Item{
    private String name;
    private double price;
    private int stock;

    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getStock(){return stock;}

    public Item(String name, double price, int stock){
        this.name = name; this.price = price; this.stock = stock;
    }
}

class Inventory{
    Map<String, List<Item>> categotyMap = new HashMap<>();

    void addItem(String category, Item item){
        categotyMap.putIfAbsent(category,new ArrayList<>());
        categotyMap.get(category).add(item);
    }

    List<Item> getItemsByCategoty(String categoty){
        return categotyMap.getOrDefault(categoty, Collections.emptyList());
    }
}
