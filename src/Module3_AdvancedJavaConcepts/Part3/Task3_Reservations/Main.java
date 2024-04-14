package Module3_AdvancedJavaConcepts.Part3.Task3_Reservations;

import Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.Model.Book;
import Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.Model.LibraryMember;
import Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.System.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Awesome Book", "Best author", "123", false);
        library.addBook(book);

        LibraryMember member = new LibraryMember("Me", 1);
        library.addMember(member);

        library.reserveBook(member, book);
        library.displayReservedBooks(member);
        library.cancelReservation(member, book);
    }
}
