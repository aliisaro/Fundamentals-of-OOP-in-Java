package Module2_DataStructures.Part3.Task1_Library;

public class Main {
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
