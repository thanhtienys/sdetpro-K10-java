package src.lab_15;

public class Book{

    //Param
    protected String ISBN;
    protected String title;
    protected String author;
    protected int year;

    //READ-ONLY
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return
                "ISBN: " + ISBN + "\n"
                + "Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Year: " + year;
    }

    private Book (AddBook addBook){
        this.ISBN = addBook.ISBN;
        this.title = addBook.title;
        this.author = addBook.author;
        this.year = addBook.year;
    }

    //WRITE ONLY
    public static class AddBook {
        private String ISBN;
        private String title;
        private String author;
        private int year;

        public AddBook setISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public AddBook setTitle(String title) {
            this.title = title;
            return this;
        }

        public AddBook setAuthor(String author) {
            this.author = author;
            return this;
        }

        public AddBook setYear(int year) {
            this.year = year;
            return this;
        }

        public Book build (){
            return new Book(this);
        }
    }
}
