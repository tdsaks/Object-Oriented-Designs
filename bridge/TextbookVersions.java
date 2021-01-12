/*
 * test program for bridge pattern
 */

public class TextbookVersions
{
  public static void main(String[] args)
	{
		System.out.println("\nCustomer 1's order");
    	Book b1 = new Complete("Introduction to Programming with Java");
		System.out.println(b1);
		System.out.println("\nCustomer 2's order");
    	Book b2 = new Abridged("Introduction to Programming with Java", 12);
		System.out.println(b2);
		System.out.println("There actually were 13 chapters omitted. "
			+ "Let's correct this:");
		b2.setOmittedChapters(13);
		System.out.println("Number of omitted chapters: " +
		b2.getOmittedChapters());
	}
}
