import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Scheduling
{
    PriorityQueue <Integer> pQueue = new PriorityQueue<>();
    Scanner obj = new Scanner(System.in);

    char bookingId;

    public void addSchedule()
    {
        String continueAdding;
        do
        {
            System.out.println("Enter your Booking ID:");
            bookingId = obj.next().charAt(0);

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

    public void deleteSchedule()
    {
        System.out.println("Choose the schedule to be removed:");
        Scanner opt = new Scanner(System.in);
        Iterator iterator = pQueue.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next() + " ");
        }

        pQueue.remove(opt.nextInt());
    }
}