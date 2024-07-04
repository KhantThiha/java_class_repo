package day10;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Member> members = new ArrayList<Member>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Member member, Book book) {
        member.borrowedBook(book);
        book.borrow();
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
        book.returnBook();
    }

    public Book findBookByTitle(String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
