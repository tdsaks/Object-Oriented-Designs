/*
 * --your name--
 */

public class BookPolicies implements Policies
{
    public void signOutPeriod(){
        System.out.println("Books circulate for four weeks");
    }

    public void requestingAndRenewing(){
        System.out.println("Books may be requested online and renewed twice.");
    }

    public void returnLocations(){
        System.out.println("Books may be returned to any library branch.");
    }
    public void overdueFines(){
        System.out.println("There are no fines during the pandemic.");
    }
}
