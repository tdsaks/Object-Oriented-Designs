/*
 * --your name--
 */

public class BoundBook {

    private Book book;
    private String format;

    public BoundBook(Book b, String f){
        book = b;
        format = f;
    }

    public String toString(){
        return book + ": " + format;
    }
}

