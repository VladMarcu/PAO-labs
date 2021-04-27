package Library;

import java.util.Scanner;

public class BookService {


    public static void showMenu() {
        System.out.println("Menu for books : ");
        System.out.println("1.Show books");
    }

    public static void showBookList(Book[] bookList) {
        System.out.println("List of all books :");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }


}
