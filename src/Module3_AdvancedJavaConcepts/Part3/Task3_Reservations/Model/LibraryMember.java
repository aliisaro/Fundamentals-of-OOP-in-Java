package Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.Model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int id;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name;}

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }
    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }
    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }
    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
