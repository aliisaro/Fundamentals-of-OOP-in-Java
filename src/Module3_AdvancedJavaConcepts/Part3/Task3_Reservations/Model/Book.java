package Module3_AdvancedJavaConcepts.Part3.Task3_Reservations.Model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved = false;
    public Book(String title, String author, String isbn, boolean reserved) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.reserved = reserved;
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
    public boolean isReserved() { return reserved; }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Isbn: " + isbn;
    }
}
