/*
 * test program for facade pattern
 */

public class WestSpringsLibrary 
{
   	public static void main(String[] args) 
	{
     	LibraryFacade lf = new LibraryFacade();
           
       	System.out.println("Main branch hours:\t" + lf.getMainHours());
       	System.out.println("Central branch hours:\t" + lf.getCentralHours());
       	System.out.println("ONeill branch hours:\t" + lf.getONeillHours());
       	System.out.println("Valente branch hours:\t" + lf.getValenteHours());
     }
}
