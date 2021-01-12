/* 
 * --your name--
 */

import java.util.HashMap;

public class BookFactory
{
    private static final HashMap<String, Book> books = new HashMap<>();
    
    public static Book makeBook(String type) {
		Book b = null;

		if (books.get(type) == null) {
			b = new Book(type);
         	books.put(type, b);
      	}

      	return books.get(type);
   	}
}
