/*
 * Test program for Fiction 
 */

public class FictionBorrower 
{
	public static void main (String [] args)
	{
		try
		{
			System.out.println("\nTrying to borrow a mystery");
			Book b = Fiction.borrowFiction("Murder on the Orient Express",
				Genre.MYSTERY);
			System.out.println("Here's what you have signed out: ");
			System.out.println(Fiction.signedOut());
			System.out.println("\nTrying to borrow a fantasy");
			Book b2 = Fiction.borrowFiction("Harry Potter and the Sorcerer's "
				+ "Stone", Genre.FANTASY);
			System.out.println("Here's what you have signed out: ");
			System.out.println(Fiction.signedOut());
			System.out.println("\nThe mystery was returned.");
			Fiction.returnFiction("Murder on the Orient Express");
			System.out.println("Here's what you have signed out: ");
			System.out.println(Fiction.signedOut());
			System.out.println("\nTrying to borrow a humorous novel");
			Book b3 = Fiction.borrowFiction("Inimitable Jeeves",
				Genre.HUMOR);
			System.out.println("Here's what you have signed out: ");
			System.out.println(Fiction.signedOut());
			System.out.println("\nTrying to borrow another fantasy");
			Book b4 = Fiction.borrowFiction("Harry Potter and the Chamber of "
				+ "Secrets", Genre.FANTASY);
			System.out.println("Here's what you have signed out: ");
			System.out.println(Fiction.signedOut());
		}

		catch(BookLimitException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
