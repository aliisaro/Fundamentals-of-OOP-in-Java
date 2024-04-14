package Module3_AdvancedJavaConcepts.Part3.Task2_Library;

import Module3_AdvancedJavaConcepts.Part3.Task2_Library.Model.Book;
import Module3_AdvancedJavaConcepts.Part3.Task2_Library.Model.LibraryMember;
import Module3_AdvancedJavaConcepts.Part3.Task2_Library.System.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Awesome Book", "Best author", "123");
        library.addBook(book);

        LibraryMember member = new LibraryMember("Me", 1);
        library.addMember(member);

        library.borrowBook(member, book);
        library.returnBook(member, book);
    }
}
