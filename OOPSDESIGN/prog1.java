package CORE;
import java.util.*;


class Book {
    private String title;
    private String author;

  
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

 
    public void displayBook() {
        System.out.println(title  + author);
    }
}


class Library {
    private String name;
    private ArrayList<Book> books;


    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }

  
    public void displayLibrary() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}


public class prog1 {
    public static void main(String[] args) {
       
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b3 = new Book("1984", "George Orwell");

      
        Library lib1 = new Library("CentralLibrary");
        Library lib2 = new Library("College Library");

       
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

      
        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
