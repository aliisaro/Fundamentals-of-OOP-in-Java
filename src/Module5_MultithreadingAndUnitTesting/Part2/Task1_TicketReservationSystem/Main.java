package Module5_MultithreadingAndUnitTesting.Part2.Task1_TicketReservationSystem;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> customerList = new HashMap<>();

        customerList.put(2, 1); // Customer 2 reserves 1 ticket
        customerList.put(5, 2);
        customerList.put(1, 2);
        customerList.put(3, 3);
        customerList.put(4, 1);
        customerList.put(6, 2);
        customerList.put(7, 1);
        customerList.put(9, 3);
        customerList.put(8, 1);
        customerList.put(10, 3);
        customerList.put(11, 2);
        customerList.put(14, 4);
        customerList.put(15, 3);
        customerList.put(12, 4);
        customerList.put(13, 1);

        Theater theater = new Theater(5, 10); // Theater with 5 rows and 10 seats per row

        // Iterate through the HashMap entries
        for (HashMap.Entry<Integer, Integer> entry : customerList.entrySet()) {
            int customerNumber = entry.getKey();
            int desiredTickets = entry.getValue();
            // Create a new Reservation object for each customer and start a thread
            Thread reservationThread = new Thread(new Reservation(theater, desiredTickets));
            reservationThread.start();
            // Introduce a delay between starting each thread
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Adjust the delay time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
