import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Booking booking = new Booking();
        Scheduling scheduling = new Scheduling();
        Reservation reservation = new Reservation();
        Scanner in = new Scanner(System.in);

        while (true)
        { // Loop until the user chooses to exit
            System.out.println("===============================================================");
            System.out.println("===============================================================");
            System.out.println("Welcome to Wasili Transport Reservation System");
            System.out.println("===============================================================");
            System.out.println("Please choose an option to continue");
            System.out.println("1. Create a Reservation");
            System.out.println("2. Check for an existing Reservation");
            System.out.println("3. Delete an existing Reservation");
            System.out.println("4. Exit");
            System.out.println("===============================================================");

            System.out.print("Your option: ");
            int options = in.nextInt();

            if (options == 1)
            {
                booking.addBooking();
                scheduling.addSchedule();
                reservation.addReservation();
            }
            else if (options == 2)
            {
                booking.getBooking();
                scheduling.getSchedule();
                reservation.checkReservation();
            }
            else if (options == 3)
            {
                booking.deleteBooking();
                scheduling.deleteSchedule();
                reservation.deleteReservation();
            }
            else if (options == 4)
            {
                System.out.println("Exiting the system. Goodbye!");
                System.exit(0); // Exit the program
            }
            else
            {
                System.out.println("Input is not valid!!");
            }
        }
    }
}
