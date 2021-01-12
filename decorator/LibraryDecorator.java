/*
 * --your name--
 */

public abstract class LibraryDecorator implements Library
{
    private Library library;

    public LibraryDecorator(Library l){
        this.library = l;
    }

    public void getLibraryItem(){
        library.getLibraryItem();
    }
}


