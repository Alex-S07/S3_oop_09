class Book {
    
    private String title;
    private String author;
    private double price;

   
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50);

        
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}