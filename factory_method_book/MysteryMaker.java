/*
 * --your name--
 */

public class MysteryMaker implements BookMaker
{
    public Book makeBook(String title, int year, String category){
        Book mysteryBook = new Mystery(title,year,category);
        return mysteryBook;
    }
}
