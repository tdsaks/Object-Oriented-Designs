/*
 * -Tommy Suh
 */

public abstract class Book implements Comparable<Book>
{
    String title, category;
    int year;

    public Book(String title, int year, String category){
        this.title = title;
        this.year = year;
        this.category = category;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public void setCategory(String category){
        this.category = category;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public String getTitle(){
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return title + ' ' + year + ' ' + category;
    }

    public abstract String getGenre();

    public int compareTo(Book book1){
        return this.year - book1.year;
    }
}
