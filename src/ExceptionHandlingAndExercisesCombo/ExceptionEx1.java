package ExceptionHandlingAndExercisesCombo;

import java.time.LocalDate;
import java.util.*;

public class ExceptionEx1 {

    public static void main(String[]args){

        Member member1 = new Member("M1","Alex");
        Member member2 = new Member("M2", "Bob");
        Member member3 = new Member("M3", "Charlie");

        Library lib = new Library();
        lib.addBook(new Book("B1","Java For Beginners"));
        lib.addBook(new Book("B2", "Advanced Java"));
        lib.addBook(new Book("B3", "Python Basics"));
        lib.addBook(new Book("B4", "Data Structures and Algorithms"));

        lib.registerMember(member1); lib.registerMember(member2); lib.registerMember(member3);

        try{
            lib.borrowBook("B1","Bob");
            lib.borrowBook("B2","Bob");
        }catch (BookNotAvailableException e){
            System.out.println("Error: " + e.getMessage());
        }


        try {
            lib.borrowBook("B3","Bob");
            lib.borrowBook("B4", "Bob");
        }catch (BookNotAvailableException e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("\nIn LIBRARY system : ");
        lib.displayAvailableBooks();
        lib.displayRegisteredMember();

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWhich book do you want to return? ");
        String bookId = scan.nextLine();
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        lib.returnBook(bookId, name);

        lib.displayAvailableBooks();

    }
}

class Book{
    private String id; private String title; private boolean isAvailable;
    private String borrowedBy;
    private LocalDate dueDate;

    public Book (String id, String title){
        this.id=id; this.title=title; this.isAvailable=true; this.borrowedBy=null;
    }

    public String getId(){return id;}
    public String getTitle(){return title;}
    public boolean isAvailable(){return isAvailable;}
    public String getBorrowedBy(){return borrowedBy;}
    public LocalDate getDueDate(){return dueDate;}

    public void borrow(String memberName, LocalDate dueDate){
        isAvailable = false;
        borrowedBy = memberName;
        this.dueDate = dueDate;
    }
    public void returnBook(){ isAvailable = true; borrowedBy = null;}
}

class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String message){
        super(message);
    }
}

class BookReturnedLateException extends Exception{
    public BookReturnedLateException(String message){
        super(message);
    }
}

class Library{
    private Map<String, Book> bookMap = new HashMap<>();
    private Map<String, Member> memberMap = new HashMap<>();
    //track borrowed books by memberName
    private Map<String, List<String>> borrowedBooks = new HashMap<>();

    public void addBook(Book book){
        bookMap.put(book.getId(), book);
    }
    public void registerMember(Member member){
        memberMap.put(member.getMemberId(), member);
        borrowedBooks.put(member.getMBname(), new ArrayList<>());
    }

    //a member can borrow upto 3 books
    public void borrowBook(String bookId, String name) throws BookNotAvailableException{
        Book book = bookMap.get(bookId);
        if(book == null){
            throw new BookNotAvailableException("Book not found.");
        }
        if(!book.isAvailable()){
            throw new BookNotAvailableException("Book is already Borrowed by other.");
        }

        // Check if member has already borrowed 3 books
        List<String> memberBooks = borrowedBooks.get(name);
        if(memberBooks==null){
            memberBooks = new ArrayList<>();
            borrowedBooks.put(name, memberBooks);
        }
        if(memberBooks.size()>=3){
            throw new BookNotAvailableException("You can only borrow 3 books.");
        }

        LocalDate dueDate = LocalDate.now().plusDays(7); //7days borrowing period

        book.borrow(name,dueDate);
        memberBooks.add(bookId);
        System.out.println(name+" just borrowed : " + book.getTitle()+" | Due by : "+dueDate);
    }


    public void returnBook(String bookId, String name){
        Book book = bookMap.get(bookId);
        if(book != null){

            try{
                if(book.getDueDate().isBefore(LocalDate.now())){
                    throw new BookReturnedLateException(name+" returned '"+book.getTitle()+"' late! Due was "+ book.getDueDate());
                }
            }catch (BookReturnedLateException e){
                System.out.println("⚠️  Warning: "+ e.getMessage());
            }

            List<String> memberBooks = borrowedBooks.get(name);
            if(memberBooks != null){
                memberBooks.remove(bookId);
            }

            book.returnBook();
            System.out.println(name+" returned : " + book.getTitle());
        }
    }

    public void displayAvailableBooks(){
        System.out.println("\nAvailable Books -> ");
        for(Book book : bookMap.values()){
            if(book.isAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }
    public void displayRegisteredMember(){
        System.out.println("\nAll members are -> ");
        //show all registered members
        for(Member member : memberMap.values()){
            System.out.println(member.getMBname());
        }
    }
}

class Member{
    private String MemberId; private String MBname;

    public Member(String memberId, String MBname){
        this.MemberId=memberId; this.MBname=MBname;
    }

    public String getMBname() {return MBname;}
    public String getMemberId(){return MemberId;}

}