package FreshCoffee_Practice2;

import java.util.*;

public class Proj1LibraryManagementSysMini {

    public static void main(String[]args){

        Library lib = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 978074327);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 978044631);
        Book book3 = new Book("1984", "George Orwell", 978045152);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 978014143);

        lib.addBook(book3); lib.addBook(book2); lib.addBook(book1);

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        Member member3 = new Member("Charlie", "M003");
        Member member4 = new Member("David", "M004");

//        lib.addMember(member4); lib.addMember(member3); lib.addMember(member2); lib.addMember(member1);
        lib.registerMember(member4); lib.registerMember(member3); lib.registerMember(member2); lib.registerMember(member1);

        lib.registerMember(member3);
        lib.registerMember(member2);
        lib.registerMember(member1);

        lib.borrowBooks(member2,book2);
        lib.borrowBooks(member1, book1);
        lib.borrowBooks(member3, book1);

        lib.displayBorrowedBooks();

        System.out.println("All BOOKS are ...");
        lib.displayAllBooks();
        System.out.println("All MEMBERS are ...");
        lib.displayAllMembers();

    }
}

class Book{
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public int getISBN(){return ISBN;}

    public String toString(){
        return "Book{title='"+title+"', author='"+author+"', ISBN="+ISBN+"}";
    }
}

class Member{
    private String name;
    private String memberID;

    public Member(String name,String memberID){
        this.name = name;
        this.memberID = memberID;
    }
    public String getName(){return name;}
    public String getMemberID(){return memberID;}
}

class Library{
    List<Book> books = new ArrayList<>();
    Map<Member, List<Book>> borrowBooks = new HashMap<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }

    public void registerMember(Member member){
        borrowBooks.put(member, new ArrayList<>());
    }

    public void borrowBooks(Member member, Book book){
        if(!books.contains(book)){
            System.out.println("Book not available in library");
            return;
        }
        borrowBooks.get(member).add(book);
//        books.remove(book);
        System.out.println("Book borrowed successfully by "+member.getName()+" borrowed "+book.getTitle());
    }

    public void displayBorrowedBooks(){
        for(Map.Entry<Member, List<Book>> entry : borrowBooks.entrySet()){
            Member member = entry.getKey();
            List<Book> borrowBooksList = entry.getValue();
            System.out.println(member.getName()+" has borrowed: ");
            for(Book book : borrowBooksList){
                System.out.println(" - "+ book);
            }
        }
    }

    public void displayAllBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void displayAllMembers(){
        for(Member member : borrowBooks.keySet()){
            System.out.println(member.getName()+" : "+member.getMemberID());
        }
    }


}