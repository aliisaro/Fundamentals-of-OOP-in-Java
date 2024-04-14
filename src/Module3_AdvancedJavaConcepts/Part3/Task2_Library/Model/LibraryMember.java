package Module3_AdvancedJavaConcepts.Part3.Task2_Library.Model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int id;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

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
}
