package FreshCoffee_Practice;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price){
        this.name=name; this.author=author; this.price=price;
    }

    public Book(String name, Author author, double price, int qtyInStock){
        this.name=name; this.author=author; this.price=price; this.qtyInStock=qtyInStock;
    }


    String getName(){return name;}
    Author getauthor(){return author;}
    double getPrice(){return price;}
    int getQtyInStock(){return qtyInStock;}

    void setPrice(double price){this.price=price;}
    void setQtyInStock(int qtyInStock){this.qtyInStock=qtyInStock;}

    public String toString(){
        return name + " by " + author;
    }
}
