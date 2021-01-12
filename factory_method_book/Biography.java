/*
 * --your name--
 */

public class Biography extends Book
{
    public Biography(String title,int year,String category){
        super(title,year,category);
    }

    public String getGenre(){
        return "memoir";
    }
}
