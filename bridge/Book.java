/*
 * --your name--
 */

public abstract class Book 
{
    private BookImplementation impl;

	public Book(BookImplementation i){
        impl = i;
    }

    public void setTitle(String title){
        impl.setTitle(title);
    }
    
    public String getTitle(){
        return impl.getTitle();
    }

    public void setOmittedChapters(int c){
        impl.setOmittedChapters(c);
    }

    public int getOmittedChapters(){
        return impl.getOmittedChapters();
    }

    
    public String toString(){
        return impl.toString();
    }
}


