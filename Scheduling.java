import java.util.PriorityQueue;
import java.util.Scanner;

class Scheduling
{
    PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    Scanner obj = new Scanner(System.in);

    int bookingID;

    public void addSchedule()
    {
        String continueAdding;

        do
        {
          System.out.println("Enter your Booking ID:");
          bookingID = obj.nextInt();

          pQueue.add(bookingID);

            System.out.println("Do you want to add another booking? (yes/no):");
            obj.nextLine();
            continueAdding = obj.nextLine();
        }
        while(continueAdding.equalsIgnoreCase("yes"));
    }


}