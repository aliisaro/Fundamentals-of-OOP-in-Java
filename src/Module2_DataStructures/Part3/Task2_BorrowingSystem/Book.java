package Module2_DataStructures.Part3.Task2_BorrowingSystem;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear;
    }
}
