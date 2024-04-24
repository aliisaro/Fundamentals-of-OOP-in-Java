package Module5_MultithreadingAndUnitTesting.Part2.Task1_TicketReservationSystem;

import java.util.HashMap;

class Reservation implements Runnable {
    private static int customerCounter = 1;
    private Theater theater;
    private int customerNumber;
    private int desiredTickets;

    public Reservation(Theater theater, int desiredTickets) {
        this.theater = theater;
        this.customerNumber = customerCounter++;
        this.desiredTickets = desiredTickets;
    }

    @Override
    public void run() {
        int ticketsReserved = 0;
        for (int i = 0; i < desiredTickets; i++) {
            if (theater.reserveSeat((customerNumber + i) % theater.getRows() + 1, (customerNumber + i) % theater.getSeatsPerRow() + 1)) {
                ticketsReserved++;
            }
        }
        if (ticketsReserved > 0) {
            System.out.println("Customer " + customerNumber + " reserved " + ticketsReserved + " tickets.");
        } else {
            System.out.println("Customer " + customerNumber + " couldn't reserve any tickets.");
        }
    }
}