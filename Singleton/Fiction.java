/*
TOMMY SUH    */

public class Fiction extends Book
{

    //instance variable
    Genre genre;

    protected Fiction(String t, Genre g){
        super(t);
        this.genre = g;
    }

    public static Fiction borrowFiction(String t, Genre g) throws BookLimitException{
        if(bookList.size() == 2){
            throw new BookLimitException("You already have two books checked out.");
        } else{
            Book fiction = new Fiction(t,g);
            bookList.add(fiction);
            return (Fiction) fiction;
        }
    }

    public static boolean returnFiction(String t){
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).title.equals(t)){
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return this.title + ' ' + this.genre;
    }
}
