import java.util.Hashtable;
import java.util.Scanner;

public class Booking {
    Hashtable<String, Integer> User = new Hashtable<>();
    Scanner obj = new Scanner(System.in);
    String name;
    int userId;


    public void addBooking()
    {
        String continueAdding;
        do
        {
            System.out.println("Enter your Name:");
            name= obj.nextLine();

            System.out.println("Enter your ID:");
            userId = obj.nextInt();

            User.put(name,userId);

            System.out.println("Do you want to add another booking? (yes/no):");
            obj.nextLine();
            continueAdding = obj.nextLine();
        }
        while (continueAdding.equalsIgnoreCase("yes"));
    }

    public void getBooking() {
        for (String i : User.keySet()) {
            System.out.println(i);
        }
    }

    public void deleteBooking() {
        System.out.println("The following are the available bookings: ");

        for (String s : User.keySet()) {
            System.out.println(s);
        }

        User.remove(obj.next());
    }


}
