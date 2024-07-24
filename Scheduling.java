import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Scheduling extends Booking
{
    PriorityQueue <Integer> pQueue = new PriorityQueue<>();
    Scanner obj = new Scanner(System.in);

    int bookingId;

    public void addSchedule()
    {
        String continueAdding;
        do
        {
            System.out.println("Enter your Booking ID:");
            bookingId = obj.nextInt();

            System.out.println("Do you want to add another booking? (yes/no):");
            obj.nextLine();
            continueAdding = obj.nextLine();
        }
        while (continueAdding.equalsIgnoreCase("yes"));
    }

    public void getSchedule()
    {
        Iterator iterator = pQueue.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next() + " ");
        }
    }
}
