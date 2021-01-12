/*
 * --your name--
 */

public class Mystery extends Book
{
    public Mystery(String title, int year, String category){
        super(title,year,category);
    }

    public String getGenre(){
        if(year > 1913 || year <= 1939){
            return "golden age";
        } else{
            return "hard-boiled";
        }
    }


}
