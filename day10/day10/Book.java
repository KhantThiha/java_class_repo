package day10;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private Boolean isAvailable = true;

    public Book(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void borrow() {
        if (isAvailable()) {
            this.isAvailable = false;
        } else {
            System.out.println("not available");
        }

    }

    public void returnBook() {
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author :" + author + " ISBN : " + ISBN + " Available:" + isAvailable();
    }
    
}
