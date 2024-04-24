package Module5_MultithreadingAndUnitTesting.Part2.Task1_TicketReservationSystem;

import java.util.HashMap;
import java.util.Map;

class Theater {
    private int rows;
    private int seats;
    private Map<String, Boolean> seatsMap;

    public Theater(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.seatsMap = new HashMap<>();
        initializeSeats();
    }

    public int getRows() {
        return rows;
    }

    public int getSeatsPerRow() {
        return seats;
    }

    private void initializeSeats() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= seats; j++) {
                String seatKey = generateSeatKey(i, j);
                seatsMap.put(seatKey, true); // true = available seat
            }
        }
    }

    public synchronized boolean isSeatAvailable(int row, int seatNumber) {
        Boolean seatAvailable = seatsMap.get(generateSeatKey(row, seatNumber));
        return seatAvailable != null && seatAvailable; // Check if the seat is available and not null
    }

    public synchronized boolean reserveSeat(int row, int seatNumber) {
        Boolean seatAvailable = seatsMap.get(generateSeatKey(row, seatNumber));
        if (seatAvailable != null && seatAvailable) {
            seatsMap.put(generateSeatKey(row, seatNumber), false); // Mark seat as reserved
            return true;
        }
        return false; // Seat already reserved or not available
    }


    private String generateSeatKey(int row, int seatNumber) {
        return row + "-" + seatNumber;
    }
}
