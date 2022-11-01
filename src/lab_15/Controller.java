package src.lab_15;

import java.util.*;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static String ISBN, title, author;
    static int year;

    protected static int getUserOption() {
        System.out.print("Enter your option: ");
        return scanner.nextInt();
    }

    protected static String inputISBN(){
        System.out.println("Input the ISBN of book : ");
        return ISBN = scanner.next();
    }

    protected static String inputTitle(){
        System.out.println("Input the Title of book : ");
        return title = scanner.next();
    }

    protected static String inputAuthor(){
        System.out.println("Input the Author of book : ");
        return author = scanner.next();
    }

    protected static int inputYear(){
        System.out.println("Input the Year of book : ");
        return year = scanner.nextInt();
    }
    public static String[] findBookISBN(List<Book> bookList, String ISBN) {

        boolean findBook = false;
        int indexOfBook = 0;

        if(checkList(bookList)) {
        
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getISBN().equals(ISBN)) {
                    findBook = true;
                    indexOfBook = i;
                }
            }
        }
        return new String[] {String.valueOf(findBook), String.valueOf(indexOfBook)};
    }


    protected static void GameMenu(){

        System.out.println("======= Book Management Program (CRUD) ======");
        System.out.println("1. New book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");

    }

    public static List<Book> addNewBook(List<Book> bookList) {

        List<Book> bookListNew = new ArrayList<>();
        try {
            //boolean isFind = false;

            String[] result = findBookISBN(bookList, ISBN = inputISBN());
            boolean isFind = Boolean.parseBoolean(result[0]);

            if (isFind) {
                System.out.println("The ISBN of book is exist!");
                return bookList;
            } else {
            Book bookNew = new Book.AddBook().setISBN(ISBN).setTitle(inputTitle())
                    .setAuthor(inputAuthor()).setYear(inputYear()).build();

            bookListNew.addAll(bookList);
            bookListNew.add(bookNew);
            }

        } catch (InputMismatchException e) {
            System.out.println("Add new book failed! Because your input wrong information of book.");
        }
        return bookListNew;
    }




    public static List<Book> findBook(List<Book> bookList) {

        String[] result = findBookISBN(bookList, ISBN = inputISBN());
        boolean isFind = Boolean.parseBoolean(result[0]);
        int indexOfBook = Integer.parseInt(result[1]);

        if (!isFind){
            System.out.println("Book " + ISBN + " is not exists! ");
        } else {
            System.out.println("Find book successful! ");
            System.out.println("=== Information of book ===");
            System.out.println(bookList.get(indexOfBook));
        }
        return bookList;
    }

    public static List<Book> updateBook(List<Book> bookList) {

        List<Book> listBookUpdate = new ArrayList<>();
        String[] result = findBookISBN(bookList, ISBN = inputISBN());
        boolean isFind = Boolean.parseBoolean(result[0]);
        if (!isFind){
            System.out.println("Book " + ISBN + " is not exists! ");
            return bookList;
        }else {
            try {
                Book bookNew = new Book.AddBook().setISBN(ISBN).setTitle(inputTitle())
                        .setAuthor(inputAuthor()).setYear(inputYear()).build();

                for (Book book : bookList) {
                    if (book.getISBN().equals(ISBN)){
                        listBookUpdate.add(bookNew);
                    } else {
                        listBookUpdate.add(book);
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return listBookUpdate;
    }
    public static List<Book> deleteBook(List<Book> bookList) {
        List<Book> bookListDelete = new ArrayList<>();

        String[] result = findBookISBN(bookList, ISBN = inputISBN());
        boolean isDelete = Boolean.parseBoolean(result[0]);

        if (!isDelete){
            System.out.println("Book " + ISBN + " is not exists! ");
            return bookList;
        } else {
            for (Book book : bookList) {
                if (!book.getISBN().equals(ISBN)) {
                    bookListDelete.add(book);
                }
            }
            System.out.println("Delete this book successful! ");
        }

        return bookListDelete;
    }

    public static void printBookList(List<Book> bookList) {

        if(checkList(bookList)){
            System.out.println("=== BOOK LIST ===");
            for (Book book : bookList) {
                System.out.println(book);
                System.out.println("----------------------");
            }
        }
    }
    protected static boolean checkList(List<Book> bookList){
        boolean ableList = true;
        if(bookList == null || bookList.isEmpty()) {
            System.out.println("Book list does not have book");
            ableList = false;
        }
        return ableList;
    }
}
