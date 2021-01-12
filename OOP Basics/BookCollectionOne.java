/*
 * program to test methods in Book
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class BookCollectionOne extends Book
{
	public static void main (String [] args)
	{
		try
		{
			// create some book objects
			Book b1 = new Book();
			Book b2 = new Book("Harry Potter and the Philosopher's Stone", 
				223, "brown", 1);
			Book b3 = new Book();
			Book b4 = new Book("Murder on the Orient Express", 212, "black", 4);
			Book b5 = new Book("Mastering the Art of French Cooking", 68, 
				"green", 3);
			
			// use static variables and methods
			System.out.println("\nOur collection has " + Book.collectionSize() 
				+ " books");
			System.out.println("\nWhich books are on the banned book list?");
			System.out.println(Book.bannedBooks());

			// use getters and setters
			System.out.println("\nWhat's the title of book b2?");
			System.out.println(b2.getTitle());
			System.out.println("Let's change it to the American title: ");
			b2.setTitle("Harry Potter and the Sorcerer's Stone");
			System.out.println(b2.getTitle());
			System.out.println("\nWhat color is the cover of b4? " 
				+ b4.getColor());
			System.out.println("It's actually white, so let's update this:");
			b4.setColor("white");
			System.out.println(b4.getColor());
			System.out.println("\nHow many pages is the cookbook? "
				+ b5.getPages());
			System.out.println("That should be 684 pages! ");
			b5.setPages(684);
			System.out.println(b5.getPages());
			System.out.println("\nWhat is rating for the Harry Potter book?");
			System.out.println(b2.getRating());
			b2.setRating(5);
			System.out.println("Oops- should be a 5.  Easily fixed!"); 
			System.out.println(b2.getRating());
			System.out.println("\nWhat is the number for book b2?");
			System.out.println(b2.getBookNumber());
			System.out.println("That looks right!");

			// use instance methods
			System.out.println("\nDo books b1 and b2 have the same rating? " 
				+ (b1.hasSameRating(b2) ? "yes" : "no"));
			System.out.println("Do books b1 and b5 have the same rating? " 
				+ (b1.hasSameRating(b5) ? "yes" : "no"));
			System.out.println("\nAre books b1 and b4 the same? " 
				+ (b1.equals(b4) ? "yes" : "no"));
			System.out.println("Are books b1 and b3 the same? " 
				+ (b1.equals(b3) ? "yes" : "no"));
			System.out.println("\nHere are their hashcodes:");
			System.out.println("b1 " + b1.hashCode() + " b4 " + b4.hashCode()
				+ " b3 " + b3.hashCode());
			int result = b2.compareTo(b4);
			System.out.println("\nWhich book has more pages, b2 or b3? " 
				+ (result > 0 ? "b2" : result < 0 ? "b4" : "both the same"));
			result = b2.compareTo(b5);
			System.out.println("Which book has more pages, b2 or b5? " 
				+ (result > 0 ? "b2" : result < 0 ? "b5" : "both the same"));
			result = b1.compareTo(b3);
			System.out.println("Which book has more pages, b2 or b3? " 
				+ (result > 0 ? "b1" : result < 0 ? "b3" : "both the same"));

			// add books to a collection
			List<Book> collection = new ArrayList<>(Arrays.asList(b1, b2, b3,
				b4, b5));

			// print information about each book using toString()
			System.out.println("\nHere are the books in our collection:\n");
			Iterator<Book> iter = collection.iterator();
			while (iter.hasNext())
			{
				System.out.println(iter.next() + "\n");
			}

			// add books to different kinds of sets
			System.out.println("Adding books to a LinkedHashSet" 
				+ " (in order added)");
			Set<Book> books = new LinkedHashSet<>(collection);
			for (Book b : books)
			{
				System.out.printf("%-40s%d\n", b.getTitle(), b.getPages());
			}
			System.out.println("\nAdding books to a HashSet (by algorithm)");
			books = new HashSet<>(collection);
			for (Book b : books)
			{
				System.out.printf("%-40s%d\n", b.getTitle(), b.getPages());
			}
			System.out.println("\nAdding books to a TreeSet (sorted by pages)");
			books = new TreeSet<>(collection);
			for (Book b : books)
			{
				System.out.printf("%-40s%d\n", b.getTitle(), b.getPages());
			}

			// trying to add a banned book
			System.out.println("\nTrying to add The Grapes of Wrath");
			collection.add(new Book("Grapes of Wrath", 364, "yellow", 3));
		}

		catch (BannedBookException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}		
