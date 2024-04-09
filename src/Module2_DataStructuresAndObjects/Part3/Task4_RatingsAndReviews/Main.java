package Module2_DataStructuresAndObjects.Part3.Task4_RatingsAndReviews;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Title1", "Author1", 2001));
        library.addBook(new Book("Title2", "Author2", 2002));
        library.addBook(new Book("Title3", "Author3", 2003));

        System.out.println("All books in the library: ");
        library.displayBooks();

        library.setRating("Title1", 5);
        library.addReview("Title1", "Great book!");
    }
}

