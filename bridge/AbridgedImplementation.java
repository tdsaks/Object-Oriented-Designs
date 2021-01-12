/*
 * --your name--
 */

public class AbridgedImplementation extends BookImplementation 
{
    public AbridgedImplementation(String t, int c){
        super(t, c);
    }

    public String toString(){
        return super.toString() + ", Abridged, " + this.chapters + " omitted chapters";
    }
}


