package Module2_DataStructures.Part3;
import java.util.ArrayList;
import java.util.Iterator;

public class Task3_AvailabilityCheck {
    public static void main(String[] args) {
        Library3 library = new Library3();

        library.addBook(new Book3("Title1", "Author1", 2001));
        library.addBook(new Book3("Title2", "Author2", 2002));
        library.addBook(new Book3("Title3", "Author3", 2003));

        System.out.println("All books in the library: ");
        library.displayBooks();

        library.borrowBook("Title1");
        library.isBookAvailable("Title1");
        library.returnBook(new Book3("Title1", "Author1", 2001));
        library.isBookAvailable("Title1");
    }
}

class Library3 {
    private ArrayList<Book3> books = new ArrayList<>();

    public void addBook(Book3 book) {
        books.add(book);
    }

    public void displayBooks() {
        int i = 0;
        for (Book3 book : books) {
            i++;
            System.out.println(i + "." + book.bookInfo());
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book3 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.bookInfo());
                found = true;
            }
        }
    }

    public void borrowBook(String title) {
        Iterator<Book3> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book3 book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("\nBook '" + title + "' has been borrowed.");
                return;
            }
        }
    }

    public void returnBook(Book3 book) {
        books.add(book);
        System.out.println("\nBook '" + book.getTitle() + "' has been returned.");
    }

    public void isBookAvailable(String title) {
        for (Book3 book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("\nBook: '" + title + "' is available.");
                return;
            }
        }
        System.out.println("\nBook: '" + title + "' is not available.");
    }
}

class Book3 {
    private String title;
    private String author;
    private int publicationYear;

    public Book3(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear;
    }
}
