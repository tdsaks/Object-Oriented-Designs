/*
 * Test program for Book
 */

public class Borrower 
{
	public static void main (String [] args)
	{
		try
		{
			System.out.println("\nTrying to borrow a book");
			Book b = Book.borrowBook("Head First Design Patterns");
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nTrying to borrow another book");
			Book b2 = Book.borrowBook("Designing with Objects");
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nWe're done with the head first book.");
			Book.returnBook("Head First Design Patterns");
			System.out.println("Here's what we now have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nTrying to borrow a children's book");
			Book b3 = Book.borrowBook("The Phantom Tollbooth");
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
			System.out.println("\nTrying to borrow another children's book");
			Book b4 = Book.borrowBook("Charlie and the Chocolate Factory");
			System.out.println("Here's what we have signed out: ");
			System.out.println(Book.signedOut());
		}

		catch(BookLimitException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
