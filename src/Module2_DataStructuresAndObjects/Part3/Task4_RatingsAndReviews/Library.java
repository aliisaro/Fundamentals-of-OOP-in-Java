package Module2_DataStructuresAndObjects.Part3.Task4_RatingsAndReviews;

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
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("\nBook '" + book.getTitle() + "' has been returned.");
    }

    public void isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("\nBook: '" + title + "' is available.");
                return;
            }
        }
        System.out.println("\nBook: '" + title + "' is not available.");
    }

    public void setRating(String title, double rating) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setRating(rating);
                System.out.println("\nRating set for book: " + title);
                return;
            }
        }
    }

    public void addReview(String title, String review) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.addReview(review);
                System.out.println("\nReview added for book: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
