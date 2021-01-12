/*
 * test program for composite pattern
 */

public class BookSeries
{
    public static void main( String args[] )
	{
		try
		{
			System.out.println("\nCustomer 1's order:");
        	Book b = new Text("Introduction to Java Programming", 12);
			System.out.println(b);
			System.out.println("\nCustomer 2's order:");
			Book s = new Series("Objects Trilogy");
			System.out.println(s);
			Book b1 = new Text("Programming with Objects", 4);		
			Book b2 = new Text("Scripting with Objects", 5);		
			Book b3 = new Text("Designs with Objects", 8);
			s.addVolume(b1);
			s.addVolume(b2);
			s.addVolume(b3);
			System.out.println("Here are the books in the series:");
			s.listTitles();	
		}
		
		catch (InapplicableOperationException e)
		{
			System.out.println(e.getMessage());	
		}
	}
}
