
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Book
{
    static List<Book> bookList = new ArrayList<Book>();

    String title;

    //constructor

    protected Book(String t){
        this.title = t;
    }

    //static methods

    public static Book borrowBook(String t) throws BookLimitException{
        if(bookList.size() == 2) {
            throw new BookLimitException("You already have 2 books checked out.");
        } else{
            Book book = new Book(t);
            bookList.add(book);
            return book;
        }
    }

    public static boolean returnBook(String t) {
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).title.equals(t)){
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }


    public static List<Book> signedOut() {
        return bookList;
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title;
    }
}
