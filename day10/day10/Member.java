package day10;
import java.util.ArrayList;

public class Member {
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks= new ArrayList<Book>();

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowedBook(Book book) {
        if(book.isAvailable()){
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
