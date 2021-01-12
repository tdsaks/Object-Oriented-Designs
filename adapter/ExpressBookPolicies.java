/*
 * --your name--
 */

public class ExpressBookPolicies implements Policies
{
    public void signOutPeriod(){
        System.out.println("Express books circulate for two weeks");
    }

    public void requestingAndRenewing(){
        System.out.println("Express books may not be requested or renewed.");
    }
    public void returnLocations(){
        System.out.println("Books may be returned to any library branch.");
    }

    public void overdueFines(){
        System.out.println("There are no fines during the pandemic.");
    }

}
