/*
 * --your name--
 */

public class Book
{
    String title, author;
    int pages, year;

    private Book(Builder builder){
        this.title = builder.title;
        this.author = builder.author;
        this.pages = builder.pages;
        this.year = builder.year;
    }

    public String toString(){
        String a = this.author == null ? "" : this.author;
        return this.title + " " + this.pages + " pages " + a + " " + this.year;
    }

    public static class Builder{
        String title, author;
        int pages, year;

        public Builder(String title, int pages){
            this.title = title;
            this.pages = pages;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public Builder year(int year){
            this.year = year;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
