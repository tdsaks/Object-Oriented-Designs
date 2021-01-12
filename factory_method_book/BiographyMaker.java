/*
 * --your name--
 */

public class BiographyMaker implements BookMaker
{
    public Book makeBook(String title, int year, String category){
        Book biographyBook = new Biography(title,year,category);
        return biographyBook;
    }

}
