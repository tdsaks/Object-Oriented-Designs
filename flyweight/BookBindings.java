/*
 * test program for flyweight pattern
 */

public class BookBindings
{
    public static void main(String[] args)
    {
        BoundBook t1 = new BoundBook(BookFactory.makeBook("Designing with "
            + "Objects"),"hardback");
        System.out.println("\nCustomer 1's order\n" + t1);
        BoundBook t2 = new BoundBook(BookFactory.makeBook("Introduction to Java"            + " Programming"), "unbound");
        System.out.println("\nCustomer 2's order\n" + t2);
        BoundBook t3 = new BoundBook(BookFactory.makeBook("Designing with "
            + "Objects"), "paperback");
        System.out.println("\nCustomer 3's order\n" + t3);
    }
}
