package Module3_AdvancedJavaConcepts.Part1.Task2_Bus;
public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 5);
        Bus bus = new Bus("Mercedes", 0);

        bus.passengerEnter(5);
        bus.passengerExit(2);
        bus.passengerEnter(10);
        bus.passengerExit(6);

        System.out.println("\nFinal amount of passengers: " + bus.getCurrentPassengers());
    }
}