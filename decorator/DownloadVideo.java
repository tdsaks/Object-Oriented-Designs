/*
 * --your name--
 */

public class DownloadVideo extends LibraryDecorator
{
    public DownloadVideo(Library l){
        super(l);
    }

    public void getLibraryItem(){
        super.getLibraryItem();
        System.out.println("You have downloaded a video.");
    }
}


