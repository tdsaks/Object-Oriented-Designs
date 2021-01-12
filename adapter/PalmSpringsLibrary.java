/* 
 * test program for adapter pattern
 */

public class PalmSpringsLibrary 
{
	private Policies p;

	public PalmSpringsLibrary()
	{
		p = new ExpressBookPolicies();
		//p = new BookPolicies();
	}

	public void bookPolicies()
	{
		p.signOutPeriod();
		p.requestingAndRenewing();
		p.returnLocations();
		p.overdueFines();
	}

	public static void main(String[] args)
	{
		PalmSpringsLibrary ps= new PalmSpringsLibrary();
    	ps.bookPolicies();
  }
}
