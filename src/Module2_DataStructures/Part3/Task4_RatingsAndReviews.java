package Module2_DataStructures.Part3;
import java.util.ArrayList;
import java.util.Iterator;

public class Task4_RatingsAndReviews {
    public static void main(String[] args) {
        Library4 library = new Library4();

        library.addBook(new Book4("Title1", "Author1", 2001));
        library.addBook(new Book4("Title2", "Author2", 2002));
        library.addBook(new Book4("Title3", "Author3", 2003));

        System.out.println("All books in the library: ");
        library.displayBooks();

        library.setRating("Title1", 5);
        library.addReview("Title1", "Great book!");
    }
}

class Library4 {
    private ArrayList<Book4> books = new ArrayList<>();

    public void addBook(Book4 book) {
        books.add(book);
    }

    public void displayBooks() {
        int i = 0;
        for (Book4 book : books) {
            i++;
            System.out.println(i + "." + book.bookInfo());
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book4 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.bookInfo());
                found = true;
            }
        }
    }

    public void borrowBook(String title) {
        Iterator<Book4> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book4 book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("\nBook '" + title + "' has been borrowed.");
                return;
            }
        }
    }

    public void returnBook(Book4 book) {
        books.add(book);
        System.out.println("\nBook '" + book.getTitle() + "' has been returned.");
    }

    public void isBookAvailable(String title) {
        for (Book4 book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("\nBook: '" + title + "' is available.");
                return;
            }
        }
        System.out.println("\nBook: '" + title + "' is not available.");
    }

    public void setRating(String title, double rating) {
        for (Book4 book : books) {
            if (book.getTitle().equals(title)) {
                book.setRating(rating);
                System.out.println("\nRating set for book: " + title);
                return;
            }
        }
    }

    public void addReview(String title, String review) {
        for (Book4 book : books) {
            if (book.getTitle().equals(title)) {
                book.addReview(review);
                System.out.println("\nReview added for book: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}

class Book4 {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;


    public Book4(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0;
        this.reviews = new ArrayList<>();
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

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear;
    }
}
