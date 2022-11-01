package src.lab_15;

import src.lab_15.Controller;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Book book001 = new Book.AddBook().setISBN("BOOK-001").setTitle("Gone with the wind")
                .setAuthor("Margaret Mitchell").setYear(1936).build();
        Book book002 = new Book.AddBook().setISBN("BOOK-002").setTitle("Sans famille")
                .setAuthor("Hector Malot ").setYear(1878).build();

        List<Book> bookList = Arrays.asList(book001, book002);

        Controller.GameMenu();

        boolean isContinue = true;
        while (isContinue) {

            int userOption = Controller.getUserOption();
            switch (userOption) {
                case 1:
                    bookList = Controller.addNewBook(bookList);
                    break;
                case 2:
                    bookList = Controller.findBook(bookList);
                    break;
                case 3:
                    bookList = Controller.updateBook(bookList);
                    break;
                case 4:
                    bookList = Controller.deleteBook(bookList);
                    break;
                case 5:
                    Controller.printBookList(bookList);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Option does not exist!");
            }


        }


    }
}
