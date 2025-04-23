package OOP_CollectionGPTPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex1LibraryBookBorrowingSystem {

    public static void main(String[]args){

        Library Library = new Library();
        Book book1 = new Book("1","The Great Gatsby","F. Scott Fitzgerald");
        Book book2 = new Book("2", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("3", "1984", "George Orwell");
        Book book4 = new Book("4", "Pride and Prejudice", "Jane Austen");
        Book book5 = new Book("5", "The Catcher in the Rye", "J.D. Salinger");
        Book book6 = new Book("6", "The Hobbit", "J.R.R. Tolkien");

        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);
        Library.addBook(book4);
        Library.addBook(book5);
        Library.addBook(book6);

        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");
        Member member3 = new Member("Charlie");
        Member member4 = new Member("David");
        Member member5 = new Member("Eve");

        Library.regMember(member1);
        Library.regMember(member2);
        Library.regMember(member3);
        Library.regMember(member4);
        Library.regMember(member5);

        //
        Library.borrowBook("1", member1);
        Library.borrowBook("2", member2);
        Library.borrowBook("3", member3);
//        Libray.borrowBook("1", member4);

        Library.displayAvailableBooks();
        System.out.println();
        Library.displayBorrowedBooks(member1);
        Library.displayBorrowedBooks(member2);
        Library.displayBorrowedBooks(member3);
        Library.displayBorrowedBooks(member4);
        Library.displayBorrowedBooks(member5);


        System.out.println();
        Library.displayMembers();
    }
}

class Book {
    private String id, title, author;
    boolean isAvailable = true;

    public String getId(){return id;}

    public Book(String id,String title,String author){
        this.id = id; this.title = title; this.author = author;
    }

    public String toString(){
        return title + " by " + author + (isAvailable ? " (Available)" : " (Borrowed)");
    }
}

class Member{
    private String name;
    Set<String> borrowedBookIds = new HashSet<>();

    public String getName(){return name;}

    public Set<String> getBorrowedBookIds() {
        return borrowedBookIds;
    }

    public Member(String name){
        this.name = name;
    }
}

class Library{
    Map<String,Book> books = new HashMap<>();
    Set<Member> members = new HashSet<>();

    void addBook(Book book){
        books.put(book.getId(),book);
    }
    void regMember(Member member){
        members.add(member);
    }

    void borrowBook(String bookId, Member member){
        Book book = books.get(bookId);
        if(book != null && book.isAvailable){
            book.isAvailable = false;
            member.borrowedBookIds.add(bookId);
        }
    }

    void returnBook(String bookId, Member member){
        Book book = books.get(bookId);
        if(member.borrowedBookIds.contains(bookId)){
            book.isAvailable = true;
            member.borrowedBookIds.remove(bookId);
        }
    }

    void displayAvailableBooks(){
        System.out.println("Available Books");
        for(Book book : books.values()){
            if(book.isAvailable){
                System.out.println(book);
            }
        }
    }

    void displayBorrowedBooks(Member member){
        System.out.println("Borrowed Books by " + member.getName());

        // First check if the borrowedBookIds is empty
        if(member.borrowedBookIds.isEmpty()){
            System.out.println(" not yet borrowed anyBook ! ");
            return;
        }

        // If there are borrowed books, loop through them
        for(String bookId : member.borrowedBookIds){
            Book book = books.get(bookId);
            if(book != null){
                System.out.println(" => "+book);
            }
        }
    }

    void displayMembers(){
        System.out.println("All Registered Members:");
        if (members.isEmpty()) {
            System.out.println(" No members registered yet.");
            return;
        }

        for(Member member : members){
            System.out.println(" - " + member.getName() +
                    " (Books borrowed: " + member.getBorrowedBookIds().size() + ")");
        }
    }

}


