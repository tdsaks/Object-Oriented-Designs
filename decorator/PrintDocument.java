/*
 * --your name--
 */

public class PrintDocument extends LibraryDecorator
{
    public PrintDocument(Library l){
        super(l);
    }

    public void getLibraryItem(){
        super.getLibraryItem();
        System.out.println("You have printed a document.");
    }
}


