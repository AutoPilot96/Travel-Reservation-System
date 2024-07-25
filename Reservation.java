import java.util.LinkedList;
import java.util.Scanner;
public class Reservation extends Booking
{
    LinkedList<String> Reservation = new LinkedList<>();
    Scanner impt = new Scanner(System.in);

    public void addReservation()
    {
        System.out.println("Reservations Available:");
        System.out.println("1.Bus");
        System.out.println("2.Train");
        System.out.println("3. Motorcycle");
        System.out.println("4. Minivan");
        System.out.println("===============================================");
        System.out.println("Please eneter the type of reservation you want:");
        Reservation.add(impt.next());
    }

    public void checkReservation()
    {
        System.out.println(Reservation);
    }

    public void deleteReservation()
    {
        System.out.println("Select reservation you want to remove:");
        Scanner rem = new Scanner(System.in);

        if (Reservation.isEmpty())
        {
            System.out.println("No reservation has been made");
        }
        else
        {
            for (int i = 0; i < Reservation.size(); i++)
            {
                System.out.println(Reservation.get(i));
            }

            Reservation.remove(rem.next());

            System.out.println(Reservation);
        }

    }

}
