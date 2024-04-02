package Module2_DataStructures.Part3;
import java.util.ArrayList;

public class Task1_LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Title1", "Author1", 2001));
        library.addBook(new Book("Title2", "Author2", 2002));
        library.addBook(new Book("Title3", "Author3", 2003));

        System.out.println("All books in the library: ");
        library.displayBooks();

        String searchAuthor = "Author1";
        System.out.println("\nBooks by Author '" + searchAuthor + "':");
        library.findBooksByAuthor(searchAuthor);

    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        int i = 0;
        for (Book book : books) {
            i++;
            System.out.println(i + "." + book.bookInfo());
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.bookInfo());
                found = true;
            }
        }
    }

}


class Book{
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
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

