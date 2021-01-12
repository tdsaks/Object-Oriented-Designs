/*
 * --your name--
 */

public final class BookDuplicator 
{
    private Book prototype_Fantasy;
    private Book prototype_Textbook;
    private Book prototype_Humor;
    
    private BookDuplicator(){
        try{
            prototype_Fantasy = Book.makeBook("fantasy");
            prototype_Textbook = Book.makeBook("textbook");
            prototype_Humor = Book.makeBook("humor");
        } catch (UnknownGenreException e){
            System.out.println(e.getMessage());
        }
    }

    public static BookDuplicator makeBookDuplicator(){
        return new BookDuplicator();
    }

    public Book duplicateFantasy(){
        Book b = null;
        try{
            b = (Book) prototype_Fantasy.clone();
        } catch(CloneNotSupportedException e){}
        return b;
    }

    public Book duplicateTextbook(){
        Book b = null;
        try{
            b = (Book) prototype_Textbook.clone();
        } catch(CloneNotSupportedException e){}
        return b;
    }

    public Book duplicateHumor(){
        Book b = null;
        try{
            b = (Book) prototype_Humor.clone();
        } catch(CloneNotSupportedException e){}
        return b;
    }

    public Book duplicateBook(String genre) throws UnknownGenreException{
        if(genre.equals("fantasy")){
            return duplicateFantasy();
        } else if(genre.equals("textbook")){
            return duplicateTextbook();
        } else if(genre.equals("humor")){
            return duplicateHumor();
        } else{
            throw new UnknownGenreException("The book club is not reading mystery books at the moment");
        }
    }
}
