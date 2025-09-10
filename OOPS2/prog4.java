package Class;

public class prog4 {
    

static class Book {
    String title;
    String author;
    double price;
    boolean available;

    
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully issued the book");
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    
    void displayBook() {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Price: " + price +
                           ", Available: " + available);
    }

    
    public static void main(String[] args) {
        Book b1 = new Book("The good man", "shakespeare", 350.0, true);

        b1.displayBook();
        b1.borrowBook();   
        b1.borrowBook();   
        b1.displayBook();
    }
}

    
}
