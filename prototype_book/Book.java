/*
 * Tommy Suh
 */

public class Book implements Cloneable 
{
    String title, author, genre;
    int year;

    private Book(String genre) throws UnknownGenreException {
        this.genre = genre;
        if(genre.equals("fantasy")){
            this.title = "Harry Potter and the Philosopher's Stone";
            this.author = "Rowling";
            this.year = 1997;
        }
        else if(genre.equals("textbook")){
            this.title = "Designing with Objects";
            this.author = "Kak";
            this.year = 2014;
        }
        else if(genre.equals("humor")){
            this.title = "Inimitable Jeeves";
            this.author = "Wodehouse";
            this.year = 1923;
        } else{
            throw new UnknownGenreException("Genre " + this.genre + " does not exist.");
        } 
    }

    public static Book makeBook(String genre) throws UnknownGenreException {
            Book returnBook = new Book(genre);
            return returnBook;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Object clone() throws CloneNotSupportedException{
        return (Book)super.clone();
    }

    public boolean equals(Book b){
        return this.title == b.title;
    }

    public String toString(){
        return this.title + ", " + this.author + ", " + this.year;
    }
}
