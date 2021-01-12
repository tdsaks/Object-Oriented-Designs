/* 
 * Tommy Suh
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//import org.graalvm.compiler.debug.CounterKey;

//public class Book implements Comparable<Book> 
public abstract class Book implements Comparable<Book> 
{

    //static variables and methods
    static List<String> bannedBooks = new ArrayList<String>(Arrays.asList("Catcher In The Rye","Grapes of Wrath","To Kill A Mockingbird"));
    static int counter = 0;

    public static List<String> bannedBooks(){
        return bannedBooks;
    }

    public static int collectionSize(){
        return counter;
    }


    //instance variable 

    String title;
    String color;
    int pages, booknum = 1;
    int rating;


    public boolean hasSameRating(Book book){
        if(this.rating == book.rating){
            return true;
        } else {
            return false;
        }
    }

    //constructors

    public Book(){
        this.title = "Designing with Objects";
        this.pages = 512;
        this.color = "wine";
        this.rating = 3;
    }

    public Book(String title,int pages,String color,int rating) throws BannedBookException{
        int flip = 0;

        for(int i = 0; i < bannedBooks().size()-1; i++){
            if(title == bannedBooks().get(i)){
                flip = 1;
            }
        }

        if(flip == 0){
            this.title = title;
            this.pages = pages;
            this.color = color;
            this.rating = rating; 
            booknum++;
            counter++;
        } else{
            throw new BannedBookException(title +  " is a banned book and may not be added to the collection!");
        }


    }


    //setters

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setPages(int newPages){
        this.pages = newPages;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void setRating(int newRating){
        this.rating = newRating;
    }

    
    //getters
    
    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public String getColor(){
        return color;
    }

    public int getRating(){
        return rating;
    }

    public int getBookNumber(){
        return booknum;
    }

    //overriden methods

    public String toString(){
        return ("The title is " + this.title + " and it has " + this.pages + " pages. The color of the book is " + this.color + " and its rating is " + this.rating +".");
    }

    public boolean equals(Book book){
        if(book.title == this.title && book.pages == this.pages){
            return true;
        } else{
            return false;
        }
    }

    public int hashCode(){
        return Objects.hash(this.title, this.pages);
    }

    public int compareTo(Book book){
        int comparenum = this.pages - book.pages;
        return comparenum;
    }

    //abstract method
    public abstract int randomRating();
    

}
