package Module2_DataStructuresAndObjects.Part3.Task2_BorrowingSystem;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void borrowBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("\nBook '" + title + "' has been borrowed.");
                return;
            }
        }
        System.out.println("\nBook: '" + title + "' is not available.");
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("\nBook '" + book.getTitle() + "' has been returned.");
    }
}
