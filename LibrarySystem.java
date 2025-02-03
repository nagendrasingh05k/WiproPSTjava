package Assignment;

/*Create a class hierarchy for a Library System. Implement a base class Item with properties like title, author,
and publicationYear. Derive two classes, Book and Magazine, from the Item class. Each derived class should have additional
properties such as genre for books and issueNumber for magazines. Write methods in each class to display their details.
Demonstrate the use of inheritance by creating objects of both classes and calling their respective methods.*/



class Item {
    protected String title;
    protected String author;
    protected int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}


class Book extends Item {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}


class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");
        Magazine magazine = new Magazine("National Geographic", "Various", 2023, 5);

        System.out.println("Book Details:");
        book.displayDetails();
        
        System.out.println("\nMagazine Details:");
        magazine.displayDetails();
    }
}
