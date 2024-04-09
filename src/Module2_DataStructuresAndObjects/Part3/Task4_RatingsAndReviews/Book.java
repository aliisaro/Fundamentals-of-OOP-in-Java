package Module2_DataStructuresAndObjects.Part3.Task4_RatingsAndReviews;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;


    public Book(String title, String author, int publicationYear) {
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
