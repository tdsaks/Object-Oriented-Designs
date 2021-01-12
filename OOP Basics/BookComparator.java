/*
Tommy Suh
 */

import java.util.Comparator;

public class BookComparator implements Comparator<Book>
{
    public int compare(Book a, Book b){
        return a.color.compareTo(b.color);
    }
}	
