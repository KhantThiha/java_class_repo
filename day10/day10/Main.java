package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Library library;
    // static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String input;
        String str;
        library = new Library();
        // Book book1 = new Book("Light", "star", "41312323123");
        // Member member1 = new Member("Joe", 0123);
        // library.addBook(book1);
        // library.addMember(member1);

        // System.out.println(book1);
        // library.borrowBook(member1, book1);
        // System.out.println(book1);
        do {
            System.out.println("Enter 1 to add book,2 to add member,3 to borrow book,4 to return book");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            input = reader.readLine();
            switch (input) {
                case "1":
                    addBook();
                    break;
                case "2":
                    addMember();
                    break;
                case "3":
                    borrowBook();
                    break;
                case "4":
                    returnBook();
                    break;
                default:
                    break;
            }
            System.out.println("Do you want to quit Y/N");
            str = reader.readLine();

        } while (!str.equals("Y"));
    }

    public static void addBook() {
        String name;
        String author;
        String ISBN;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Enter Book name");
            name = reader.readLine();
            System.out.println("Enter Author name");
            author = reader.readLine();
            System.out.println("Enter ISBN");
            ISBN = reader.readLine();
            Book book = new Book(name, author, ISBN);
            library.addBook(book);
        } catch (Exception e) {
        }
    }

    public static void addMember() {
        String name;
        int memberId;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Enter member name");
            name = reader.readLine();
            System.out.println("Enter member Id");
            memberId = Integer.parseInt(reader.readLine());
            Member member = new Member(name, memberId);
            library.addMember(member);
        } catch (Exception e) {
        }
    }

    public static void borrowBook() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name;
        String membername;
        try {
            System.out.println("Enter book name");
            name = reader.readLine();
            ;
            System.out.println("Enter member name");
            membername = reader.readLine();

            Book borrowBook = library.findBookByTitle(name);
            Member borrowMember = library.findMemberByName(membername);
            library.borrowBook(borrowMember, borrowBook);

        } catch (Exception e) {
        }
    }

    public static void returnBook() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name;
        String membername;
        try {
            System.out.println("Enter book name");
            name = reader.readLine();
            System.out.println("Enter member name");
            membername = reader.readLine();

            Book returnBook = library.findBookByTitle(name);
            Member returnMember = library.findMemberByName(membername);
            library.borrowBook(returnMember, returnBook);

        } catch (Exception e) {
        }
    }
}
