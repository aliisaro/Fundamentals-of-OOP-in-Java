package Module3_AdvancedJavaConcepts.Part3.Task2_Library.Model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Isbn: " + isbn;
    }
}
