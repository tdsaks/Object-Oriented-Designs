/*
 * --your name--
 */

public class BorrowBook extends LibraryDecorator
{

    public BorrowBook(Library l){
        super(l);
    }

    public void getLibraryItem(){
        super.getLibraryItem();
        System.out.println("You have signed out a book");
    }
}


