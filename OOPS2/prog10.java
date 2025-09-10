package Class;

public class prog11 {
    


static class Book {
    public String ISBN;       
    protected String title;   
    private String author;    

   
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    
    public String getAuthor() {
        return author;
    }

    
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    
    public void displayBook() {
        System.out.println("ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + author);
    }
}


class EBook extends Book {
    double fileSizeMB;
    EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    
    public void displayEBook() {
        System.out.println("EBook -> ISBN: " + ISBN +   
                           ", Title: " + title +        
                           ", Author: " + getAuthor() + 
                           ", File Size: " + fileSizeMB + "MB");
    }
}


class TestLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("978-0135166307", "Effective Java", "Joshua Bloch");
        b1.displayBook();

        
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());

        
        EBook eb1 = new EBook("978-1492056270", "Java Concurrency", "Brian Goetz", 5.6);
        eb1.displayEBook();
    }
}

    
}
