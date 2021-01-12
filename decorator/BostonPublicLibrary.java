/*
 * test program for decorator pattern
 */

public class BostonPublicLibrary
{
	public static void main(String [] args)
	{
		System.out.println("\nPatron one");
        Library l1 = new BorrowBook(new LibraryCore());
        l1.getLibraryItem();

		System.out.println("\nPatron two");
        Library l2 = new DownloadVideo(new LibraryCore());
        l2.getLibraryItem();

		System.out.println("\nPatron three");
        Library l3= new PrintDocument(new LibraryCore());
        l3.getLibraryItem();

		System.out.println("\nPatron four");
        Library l4 = new BorrowBook(new PrintDocument(new DownloadVideo
			(new BorrowBook(new LibraryCore()))));
        l4.getLibraryItem();
    }
}
