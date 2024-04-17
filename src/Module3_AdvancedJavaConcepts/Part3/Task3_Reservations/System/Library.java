package Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.System;

import Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.Model.Book;
import Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.Model.LibraryMember;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to library.");
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member '" + member.getName() + "' added to library.");
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            books.remove(book);
            member.borrowBook(book);
            System.out.println("Member '" + member.getName() + "' borrowed book '" + book.getTitle() + "'");
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("Member '" + member.getName() + "' can't return book '" + book.getTitle() + "'. It is not borrowed by this member.");
        } else {
            member.returnBook(book);
            books.add(book);
            System.out.println("Member '" + member.getName() + "' returned book '" + book.getTitle() + "'");
        }
    }
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book '" + book.getTitle() + "' reserved successfully by '" + member.getName() + "'.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation of book '" + book.getTitle() + "' canceled successfully by member '" + member.getName() + "'.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for member '" + member.getName() + "':");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
