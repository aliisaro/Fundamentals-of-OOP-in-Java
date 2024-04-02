package Module2_DataStructures.Part3;
import java.util.ArrayList;
import java.util.Iterator;

public class Task2_BorrowingSystem {
    public static void main(String[] args) {
        Library2 library = new Library2();

        library.addBook(new Book2("Title1", "Author1", 2001));
        library.addBook(new Book2("Title2", "Author2", 2002));
        library.addBook(new Book2("Title3", "Author3", 2003));

        System.out.println("All books in the library: ");
        library.displayBooks();

        library.borrowBook("Title1");
        library.borrowBook("Title1");
        library.returnBook(new Book2("Title1", "Author1", 2001));
        library.borrowBook("Title1");

    }
}

class Library2 {
    private ArrayList<Book2> books = new ArrayList<>();

    public void addBook(Book2 book) {
        books.add(book);
    }

    public void displayBooks() {
        int i = 0;
        for (Book2 book : books) {
            i++;
            System.out.println(i + "." + book.bookInfo());
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book2 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.bookInfo());
                found = true;
            }
        }
    }

    public void borrowBook(String title) {
        Iterator<Book2> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book2 book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("\nBook '" + title + "' has been borrowed.");
                return;
            }
        }
        System.out.println("\nBook: '" + title + "' is not available.");
    }

    public void returnBook(Book2 book) {
        books.add(book);
        System.out.println("\nBook '" + book.getTitle() + "' has been returned.");
    }
}

class Book2 {
    private String title;
    private String author;
    private int publicationYear;

    public Book2(String title, String author, int publicationYear) {
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
