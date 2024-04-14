package Module3_AdvancedJavaConcepts.Part3.Task2_Library.System;

import java.util.ArrayList;
import Module3_AdvancedJavaConcepts.Part3.Task2_Library.Model.Book;
import Module3_AdvancedJavaConcepts.Part3.Task2_Library.Model.LibraryMember;

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
}
