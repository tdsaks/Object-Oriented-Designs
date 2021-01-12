/*
 * program to test methods in Fiction and NonFiction
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class BookCollectionTwo
{
	public static void main (String [] args)
	{
		try
		{
			// create some book objects
			Book b1 = new NonFiction();
			Book b2 = new Fiction("Harry Potter and the Sorcerer's Stone", 
				223, "brown", 5, Genre.FANTASY);
			Book b3 = new NonFiction();
			Book b4 = new Fiction("Murder on the Orient Express", 212, 
				"black", 5, Genre.MYSTERY);
			Book b5 = new NonFiction("Mastering the Art of French Cooking", 
				68, "green", 3, 641);
			Book b6 = new Fiction("The Inimitable Jeeves", 253, "ecru", 3, 
				Genre.HUMOR);
			
			// add them to a collection
			List<Book> collection = new ArrayList<>(Arrays.asList
				(b1, b2, b3, b4, b5, b6));

			// print information about each book using toString()
			System.out.println("\nHere are the books in our collection:\n");
			Iterator<Book> iter = collection.iterator();
			while (iter.hasNext())
			{
				System.out.println(iter.next() + "\n");
			}

			// use superclass method implemented differently in subclasses
			System.out.println("Let's give books b3 and b6 random ratings:\n");
			b3.setRating(b6.randomRating());
			b6.setRating(b3.randomRating());
			System.out.println(b3 + "\n");
			System.out.println(b6);

			// use methods from subclasses
			Fiction f2 = (Fiction) b2;
			Fiction f4 = (Fiction) b4;
			System.out.println("\nAre books b2 and b4 in the same genre? "
				+ (f2.isSameGenre(f4) ? "yes" : "no"));
			System.out.println("What are their genres?");
			System.out.println("b2 is " + f2.getGenre());
			System.out.println("b4 is " + f4.getGenre());

			NonFiction n1 = (NonFiction) b1;
			NonFiction n3 = (NonFiction) b3;
			System.out.println("\nDo books b1 and b3 have the same call number "
				+ (n1.hasSameCallNumber(n3) ? "yes" : "no"));
			System.out.printf("b1 %03d  b3 %03d\n", n1.getCallNumber(),
				n3.getCallNumber());
			NonFiction n5 = (NonFiction) b5;
			System.out.println("Do books b1 and b5 have the same call number "
				+ (n1.hasSameCallNumber(n5) ? "yes" : "no"));
			System.out.printf("b1 %03d  b3 %03d\n", n1.getCallNumber(),
				n5.getCallNumber());

			// sort using comparator
			System.out.println("\nLet's sort the books by color:\n");
			collection.sort(new BookComparator());
			for (Book b : collection)
			{
				System.out.println(b.getColor() + "\t" +  b.getTitle());
			}

			// add some book properties to a map
			System.out.println("\nSince we have some duplicates, let's tally "
				+ "the collection in a TreeMap:\n"); 
			Map<String, Integer> bookCounts = new TreeMap<>();
			for (Book b : collection)
			{
				String title = b.getTitle();
				Integer count = bookCounts.get(title);
				count = (count == null) ? 1 : count+1;
				bookCounts.put(title, count);
			}
			for (Map.Entry<String, Integer>  pair: bookCounts.entrySet()) 
			{
   				 System.out.printf("%-40s%d\n",pair.getKey(), pair.getValue());
			}
		}

		catch (BannedBookException e)
		{
			System.out.println(e.getMessage());
		}
	}
}		
