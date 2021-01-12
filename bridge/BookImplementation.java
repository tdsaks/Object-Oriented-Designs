/*
 * --your name--
 */

public abstract class BookImplementation
{
    public String title;
    public int chapters;

    public BookImplementation(String t, int c){
        this.title = t;
        this.chapters = c;
    }

    public BookImplementation(String t){
        this.title = t;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public String getTitle(){
        return this.title;
    }

    public void setOmittedChapters(int c){
        this.chapters = c;
    }

    public int getOmittedChapters(){
        return this.chapters;
    }

    public String toString(){
        return getTitle();
    }
}


